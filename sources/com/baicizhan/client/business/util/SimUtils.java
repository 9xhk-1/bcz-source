package com.baicizhan.client.business.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SimUtils {
    public static final int $stable = 0;

    @m80.k
    public static final SimUtils INSTANCE = new SimUtils();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OperatorType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ OperatorType[] $VALUES;
        private final int type;
        public static final OperatorType CMCC = new OperatorType("CMCC", 0, 1);
        public static final OperatorType CUCC = new OperatorType("CUCC", 1, 2);
        public static final OperatorType CTCC = new OperatorType("CTCC", 2, 3);
        public static final OperatorType UNKNOWN = new OperatorType("UNKNOWN", 3, 0);

        private static final /* synthetic */ OperatorType[] $values() {
            return new OperatorType[]{CMCC, CUCC, CTCC, UNKNOWN};
        }

        static {
            OperatorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private OperatorType(String str, int i11, int i12) {
            this.type = i12;
        }

        @m80.k
        public static m00.a<OperatorType> getEntries() {
            return $ENTRIES;
        }

        public static OperatorType valueOf(String str) {
            return (OperatorType) Enum.valueOf(OperatorType.class, str);
        }

        public static OperatorType[] values() {
            return (OperatorType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    private SimUtils() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r2.equals("46007") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        return com.baicizhan.client.business.util.SimUtils.OperatorType.CMCC.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r2.equals("46006") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        return com.baicizhan.client.business.util.SimUtils.OperatorType.CUCC.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r2.equals("46005") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        return com.baicizhan.client.business.util.SimUtils.OperatorType.CTCC.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r2.equals("46004") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r2.equals("46003") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r2.equals("46002") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r2.equals("46001") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r2.equals("46000") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r2.equals("46011") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r2.equals("46009") == false) goto L55;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getCurrentOperator() {
        /*
            r3 = this;
            android.content.Context r0 = com.baicizhan.client.business.util.KotlinExtKt.getGlobalApplicationContext()
            boolean r0 = r3.hasSim(r0)
            if (r0 != 0) goto L11
            com.baicizhan.client.business.util.SimUtils$OperatorType r0 = com.baicizhan.client.business.util.SimUtils.OperatorType.UNKNOWN
            int r0 = r0.getType()
            return r0
        L11:
            android.content.Context r0 = com.baicizhan.client.business.util.KotlinExtKt.getGlobalApplicationContext()
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.telephony.TelephonyManager
            r2 = 0
            if (r1 == 0) goto L23
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 == 0) goto L2a
            java.lang.String r2 = r0.getSimOperator()
        L2a:
            if (r2 == 0) goto Laf
            int r0 = r2.hashCode()
            r1 = 49679479(0x2f60c77, float:3.6153606E-37)
            if (r0 == r1) goto L9f
            r1 = 49679502(0x2f60c8e, float:3.6153657E-37)
            if (r0 == r1) goto L8f
            switch(r0) {
                case 49679470: goto L7f;
                case 49679471: goto L76;
                case 49679472: goto L6d;
                case 49679473: goto L64;
                case 49679474: goto L5b;
                case 49679475: goto L52;
                case 49679476: goto L49;
                case 49679477: goto L3f;
                default: goto L3d;
            }
        L3d:
            goto Laf
        L3f:
            java.lang.String r0 = "46007"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L88
            goto Laf
        L49:
            java.lang.String r0 = "46006"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La8
            goto Laf
        L52:
            java.lang.String r0 = "46005"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L98
            goto Laf
        L5b:
            java.lang.String r0 = "46004"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L88
            goto Laf
        L64:
            java.lang.String r0 = "46003"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L98
            goto Laf
        L6d:
            java.lang.String r0 = "46002"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L88
            goto Laf
        L76:
            java.lang.String r0 = "46001"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La8
            goto Laf
        L7f:
            java.lang.String r0 = "46000"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L88
            goto Laf
        L88:
            com.baicizhan.client.business.util.SimUtils$OperatorType r0 = com.baicizhan.client.business.util.SimUtils.OperatorType.CMCC
            int r0 = r0.getType()
            return r0
        L8f:
            java.lang.String r0 = "46011"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L98
            goto Laf
        L98:
            com.baicizhan.client.business.util.SimUtils$OperatorType r0 = com.baicizhan.client.business.util.SimUtils.OperatorType.CTCC
            int r0 = r0.getType()
            return r0
        L9f:
            java.lang.String r0 = "46009"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La8
            goto Laf
        La8:
            com.baicizhan.client.business.util.SimUtils$OperatorType r0 = com.baicizhan.client.business.util.SimUtils.OperatorType.CUCC
            int r0 = r0.getType()
            return r0
        Laf:
            com.baicizhan.client.business.util.SimUtils$OperatorType r0 = com.baicizhan.client.business.util.SimUtils.OperatorType.UNKNOWN
            int r0 = r0.getType()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.SimUtils.getCurrentOperator():int");
    }

    public final boolean hasSim(@m80.k Context context) {
        g0.p(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
        return (simOperator == null || simOperator.length() == 0) ? false : true;
    }
}
