package com.badlogic.gdx.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum Architecture {
    x86,
    ARM,
    RISCV,
    LOONGARCH;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Bitness {
        _32,
        _64,
        _128;

        public String toSuffix() {
            return this == _32 ? "" : name().substring(1);
        }
    }

    public String toSuffix() {
        return this == x86 ? "" : name().toLowerCase();
    }
}
