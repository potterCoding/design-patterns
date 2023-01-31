package example;

/**
 * @author sunql
 * @date 2023年01月14日 11:16
 *
 * 使用策略模式优化  奖励服务
 */
public class RewardService02 {
    public void issueReward(String rewardType, Object ... params) {
        Strategy strategy = StrategyContext.getStrategy(rewardType);
        strategy.issue(params);
    }
}

/**
 * 策略接口
 */
interface Strategy {
    void issue(Object... params);
}

/**
 * 策略模式的环境类，并供奖励服务调用
 */
class StrategyContext {
    // 使用分支判断获取的策略上下文
    public static Strategy getStrategy(String rewardType) {
        switch (rewardType) {
            case "Waimai":
                return new Waimai();
            case "Hotel":
                return new Hotel();
            case "Food":
                return new Food();
            default:
                throw new IllegalArgumentException("rewardType error!");
        }
    }
}

// 外卖策略
class Waimai implements Strategy {
    private WaimaiService waimaiService;

    @Override
    public void issue(Object... params) {
        WaimaiRequest request = new WaimaiRequest();
        // 构建入参
        request.setWaimaiReq(params);
        waimaiService.issueWaimai(request);
    }
}

// 酒旅策略
class Hotel implements Strategy {
    private HotelService hotelService;

    @Override
    public void issue(Object... params) {
        HotelRequest request = new HotelRequest();
        request.addHotelReq(params);
        hotelService.sendPrize(request);
    }
}

// 美食策略
class Food implements Strategy {
    private FoodService foodService;
    
    @Override
    public void issue(Object... params) {
        FoodRequest request = new FoodRequest(params);
        foodService.payCoupon(request);
    }
}
