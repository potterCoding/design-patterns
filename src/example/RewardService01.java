package example;

/**
 * @author sunql
 * @date 2023年01月14日 10:56
 *
 * 需求：做一个活动营销，需要用户参与一个活动，然后完成一系列的任务，
 * 最后可以得到一些奖励作为回报。活动的奖励包含美团外卖、酒旅 和美食等多种品类券，现在需要设计一套奖励发放方案。
 *
 * <p>
 *     奖励服务
 * </p>
 */
public class RewardService01 {
    // 外部服务
    private WaimaiService waimaiService;
    private HotelService hotelService;
    private FoodService foodService;

    // 使用对入参的条件判断进行发奖
    public void issueReward(String rewardType, Object... params) {
        if ("Waimai".equals(rewardType)) {
            WaimaiRequest request = new WaimaiRequest();
            // 构建入参
            request.setWaimaiReq(params);
            waimaiService.issueWaimai(request);
        } else if ("Hotel".equals(rewardType)) {
            HotelRequest request = new HotelRequest();
            request.addHotelReq(params);
            hotelService.sendPrize(request);
        } else if ("Food".equals(rewardType)) {
            FoodRequest request = new FoodRequest(params);
            foodService.payCoupon(request);
        } else {
            throw new IllegalArgumentException("rewardType error!");
        }
    }

    // 上述代码问题：
    // 1. 不符合开闭原则，可以预见，如果后续新增品类券的话，需要直接修改主干代码，而我们提倡代码应该是对修改封闭的
    // 2. 不符合迪米特法则，发奖逻辑和各个下游接口高度耦合，这导致接口的改变将直接影响到代码的组织，使得代码的可维护性降低。

    // 优化思路：将各个同下游接口交互的功能抽象成单独的服务，封装其参数组装及异常处理，使得发奖主逻辑与其解耦
}

/**
 * 外卖服务
 */
class WaimaiService {
    void issueWaimai(WaimaiRequest request) {}
}

/**
 * 酒旅服务
 */
class HotelService {
    void sendPrize(HotelRequest request) {}
}

/**
 * 美食服务
 */
class FoodService {
    void payCoupon(FoodRequest request) {}
}

/**
 * 外卖入参
 */
class WaimaiRequest {
    public void setWaimaiReq(Object... param){}
}

/**
 * 酒旅入参
 */
class HotelRequest {
    public void addHotelReq(Object... param){}
}

/**
 * 美食入参
 */
class FoodRequest {
    public FoodRequest(Object... param){}
}
