package com.tencent.liteav.basic.module;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a {
    private String mID = "";

    public void clearID() {
        synchronized (this) {
            try {
                if (this.mID.length() != 0) {
                    TXCStatus.b(this.mID);
                    this.mID = "";
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void finalize() throws Throwable {
        clearID();
        super.finalize();
    }

    public double getDoubleValue(int i11) {
        return TXCStatus.d(this.mID, i11);
    }

    public String getID() {
        return this.mID;
    }

    public int getIntValue(int i11) {
        return TXCStatus.c(this.mID, i11);
    }

    public long getLongValue(int i11) {
        return TXCStatus.a(this.mID, i11);
    }

    public String getStringValue(int i11) {
        return TXCStatus.b(this.mID, i11);
    }

    public void setID(String str) {
        clearID();
        synchronized (this) {
            try {
                if (str.length() != 0) {
                    this.mID = str;
                    TXCStatus.a(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean setStatusValue(int i11, Object obj) {
        return TXCStatus.a(this.mID, i11, obj);
    }

    public double getDoubleValue(int i11, int i12) {
        return TXCStatus.d(this.mID, i11, i12);
    }

    public int getIntValue(int i11, int i12) {
        return TXCStatus.c(this.mID, i11, i12);
    }

    public long getLongValue(int i11, int i12) {
        return TXCStatus.a(this.mID, i11, i12);
    }

    public String getStringValue(int i11, int i12) {
        return TXCStatus.b(this.mID, i11, i12);
    }

    public boolean setStatusValue(int i11, int i12, Object obj) {
        return TXCStatus.a(this.mID, i11, i12, obj);
    }
}
