package com.mob.tools.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class FilePart extends HTTPPart {

    /* renamed from: a, reason: collision with root package name */
    private File f41313a;

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() throws Throwable {
        return new FileInputStream(this.f41313a);
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() throws Throwable {
        return this.f41313a.length();
    }

    public void setFile(File file) {
        this.f41313a = file;
    }

    public String toString() {
        return this.f41313a.toString();
    }

    public void setFile(String str) {
        this.f41313a = new File(str);
    }
}
