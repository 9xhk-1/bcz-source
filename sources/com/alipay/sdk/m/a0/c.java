package com.alipay.sdk.m.a0;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f10470a;

    public c(b bVar) {
        this.f10470a = bVar;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return Pattern.matches(nk.b.f75176b, file.getName());
    }
}
