package gi;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.baicizhan.client.business.util.KotlinExtKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @m80.k
    public static final String a() {
        if (!b(KotlinExtKt.getGlobalApplicationContext())) {
            return "UNKNOWN";
        }
        Object systemService = KotlinExtKt.getGlobalApplicationContext().getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
        if (simOperator != null) {
            int hashCode = simOperator.hashCode();
            if (hashCode != 49679479) {
                if (hashCode != 49679502) {
                    switch (hashCode) {
                        case 49679470:
                            if (simOperator.equals("46000")) {
                                return "CMCC";
                            }
                            break;
                        case 49679471:
                            if (simOperator.equals("46001")) {
                                return "CUCC";
                            }
                            break;
                        case 49679472:
                            if (simOperator.equals("46002")) {
                                return "CMCC";
                            }
                            break;
                        case 49679473:
                            if (simOperator.equals("46003")) {
                                return "CTCC";
                            }
                            break;
                        case 49679474:
                            if (simOperator.equals("46004")) {
                                return "CMCC";
                            }
                            break;
                        case 49679475:
                            if (simOperator.equals("46005")) {
                                return "CTCC";
                            }
                            break;
                        case 49679476:
                            if (simOperator.equals("46006")) {
                                return "CUCC";
                            }
                            break;
                        case 49679477:
                            if (simOperator.equals("46007")) {
                                return "CMCC";
                            }
                            break;
                    }
                } else if (simOperator.equals("46011")) {
                    return "CTCC";
                }
            } else if (simOperator.equals("46009")) {
                return "CUCC";
            }
        }
        return "UNKNOWN";
    }

    public static final boolean b(@m80.k Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
        return (simOperator == null || simOperator.length() == 0) ? false : true;
    }
}
