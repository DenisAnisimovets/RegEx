import Utils.ThreadUtil;
import activities.CallReceiver;
import activities.Distributor;

public class RegExRunner {
    public static void main(String[] args) {
        CallReceiver callReceiver = new CallReceiver();
        Distributor distributor = new Distributor();
        ThreadUtil.startThreads(callReceiver, distributor);
    }
}
