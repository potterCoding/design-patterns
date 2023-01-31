package example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunql
 * @date 2023年01月14日 11:18
 *
 * <p>
 *    在策略环境类中使用一个注册表来记录各个策略类的注册信息，
 *    并提供接口供策略类调用进行注册。同时使用饿汉式单例模式去优化策略类的设计
 * </p>
 */
public class RewardService03 {
    public void issueReward(String rewardType, Object ... params) {
        Strategy strategy = StrategyContext02.getStrategy(rewardType);
        strategy.issue(params);
    }
}

/**
 *  策略上下文，用于管理策略的注册和获取
 */
class StrategyContext02 {
    private static final Map<String, Strategy> registerMap = new HashMap<>();

    // 注册策略
    public static void registerStrategy(String rewardType, Strategy strategy) {
        registerMap.putIfAbsent(rewardType, strategy);
    }

    // 获取策略
    public static Strategy getStrategy(String rewardType) {
        return registerMap.get(rewardType);
    }
}

/**
 * 抽象策略类
 */
abstract class AbstractStrategy implements Strategy {
    // 类注册方法
    public void register() {
        StrategyContext02.registerStrategy(getClass().getSimpleName(), this);
    }
}

/**
 * 单例外卖策略
 */
class Waimai02 extends AbstractStrategy implements Strategy {
    private static final Waimai instance = new Waimai();
    private WaimaiService waimaiService;

    private Waimai02() {
        register();
    }

    public static Waimai getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        WaimaiRequest request = new WaimaiRequest();
        // 构建入参
        request.setWaimaiReq(params);
        waimaiService.issueWaimai(request);
    }
}

/**
 * 单例酒旅策略
 */
class Hotel02 extends AbstractStrategy implements Strategy {
    private static final Hotel instance = new Hotel();
    private HotelService hotelService;

    private Hotel02() {
        register();
    }

    public static Hotel getInstance() {
        return instance;
    }
    @Override
    public void issue(Object... params) {
        HotelRequest request = new HotelRequest();
        request.addHotelReq(params);
        hotelService.sendPrize(request);
    }
}

// 单例美食策略
class Food02 extends AbstractStrategy implements Strategy {
    private static final Food instance = new Food();
    private FoodService foodService;

    private Food02() {
        register();
    }

    public static Food getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        FoodRequest request = new FoodRequest(params);
        foodService.payCoupon(request);
    }
}