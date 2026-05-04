package com.alipay.sdk.app;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class EnvUtils {
    public static EnvEnum mEnv = EnvEnum.ONLINE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum EnvEnum {
        ONLINE,
        PRE_SANDBOX,
        SANDBOX
    }

    public static EnvEnum geEnv() {
        return mEnv;
    }

    public static boolean isNewSanBox() {
        return mEnv == EnvEnum.SANDBOX;
    }

    public static boolean isPreSandBox() {
        return mEnv == EnvEnum.PRE_SANDBOX;
    }

    public static boolean isSandBox() {
        return isPreSandBox() || isNewSanBox();
    }

    public static void setEnv(EnvEnum envEnum) {
        mEnv = envEnum;
    }
}
