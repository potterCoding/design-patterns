package state.gumball;

/**
 * 糖果机：V1.0.0
 * 状态机流程：
 * 起始没有25分钱 -> 投入25分钱->有25分钱 -> 退回25分钱或扭转曲柄
 * 扭转曲柄->发放糖果（有糖果则发放、无糖果则返回已售完）
 * 退回25分钱->等待投入
 */
public class GumballMachine {
    final static int SOLD_OUT = 0; // 已售罄
    final static int NO_QUARTER = 1; // 未投入25分钱
    final static int HAS_QUARTER = 2; // 已投入25分钱
    final static int SOLD = 3; // 售出糖果

    int state = SOLD_OUT; // 初始状态为已售罄
    int count = 0; // 糖果机中的糖果初始数量为0

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 投入25分钱
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("请勿重复投入25分钱！");
        } else if (state == NO_QUARTER) {
            // 状态改变为已投入25分钱
            state = HAS_QUARTER;
            System.out.println("你已经投入了25分钱！");
        } else if (state == SOLD_OUT) {
            System.out.println("你不能投入25分钱，糖果机已售罄");
        } else if (state == SOLD) {
            System.out.println("正在发放糖果，请稍后...");
        }
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("25分钱已退回");
            // 状态改变到没有投入25分钱
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("你没有投入25分钱！");
        } else if (state == SOLD) {
            System.out.println("很抱歉，糖果正在发放中");
        } else if (state == SOLD_OUT) {
            System.out.println("不能退回25分钱，糖果已售出");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("别想骗过机器拿到两次糖果");
        } else if (state == NO_QUARTER) {
            System.out.println("你未投入25分钱不能发放糖果");
        } else if (state == SOLD_OUT) {
            System.out.println("糖果已售罄");
        } else if (state == HAS_QUARTER) {
            System.out.println("正在发放糖果中");
            // 改变状态到售出糖果
            state = SOLD;
            // 调用发放糖果方法
            dispense();
        }
    }

    /**
     * 发放糖果
     */
    private void dispense() {
        if (state == SOLD) {
            System.out.println("一颗糖果正在从糖果机中滚出来");
            count = count - 1; // 糖果数减1
            if (count == 0) {
                System.out.println("糖果已售罄");
                // 状态改变为已售罄
                state = SOLD_OUT;
            } else {
                // 如果还有糖果，状态改变为未投入25分钱
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("你需要先投入25分钱");
        } else if (state == SOLD_OUT) {
            System.out.println("糖果已售罄");
        } else if (state == HAS_QUARTER) {
            System.out.println("不能发放糖果");
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
