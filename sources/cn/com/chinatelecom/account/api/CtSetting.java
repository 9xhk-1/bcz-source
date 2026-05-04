package cn.com.chinatelecom.account.api;

/* loaded from: classes3.dex */
public class CtSetting {
    private static final int DEFAULT_CONN_TIMEOUT = 5000;
    private static final int DEFAULT_READ_TIMEOUT = 5000;
    private static final int DEFAULT_TOTAL_TIMEOUT = 10000;
    private int connTimeout;
    private int readTimeout;
    private int totalTimeout;

    public CtSetting() {
        this.totalTimeout = 0;
        this.connTimeout = 0;
        this.readTimeout = 0;
    }

    public static int getConnTimeout(CtSetting ctSetting) {
        int i11;
        if (ctSetting == null || (i11 = ctSetting.connTimeout) <= 0) {
            return 5000;
        }
        return i11;
    }

    public static int getReadTimeout(CtSetting ctSetting) {
        int i11;
        if (ctSetting == null || (i11 = ctSetting.readTimeout) <= 0) {
            return 5000;
        }
        return i11;
    }

    public static int getTotalTimeout(CtSetting ctSetting) {
        int i11;
        if (ctSetting == null || (i11 = ctSetting.totalTimeout) <= 0) {
            return 10000;
        }
        return i11;
    }

    public void setConnTimeout(int i11) {
        this.connTimeout = i11;
    }

    public void setReadTimeout(int i11) {
        this.readTimeout = i11;
    }

    public void setTotalTimeout(int i11) {
        this.totalTimeout = i11;
    }

    public CtSetting(int i11, int i12, int i13) {
        this.connTimeout = i11;
        this.readTimeout = i12;
        this.totalTimeout = i13;
    }
}
