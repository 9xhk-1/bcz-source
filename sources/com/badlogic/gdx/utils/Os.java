package com.badlogic.gdx.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum Os {
    Windows,
    Linux,
    MacOsX,
    Android,
    IOS;

    public String getJniPlatform() {
        return this == Windows ? "win32" : this == Linux ? "linux" : this == MacOsX ? "mac" : "";
    }

    public String getLibExtension() {
        return this == Windows ? "dll" : this == Linux ? "so" : this == MacOsX ? "dylib" : this == Android ? "so" : "";
    }

    public String getLibPrefix() {
        return (this == Linux || this == Android || this == MacOsX) ? ul.e.f92290g : "";
    }
}
