package com.mob.tools.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class MultiPart extends HTTPPart {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<HTTPPart> f41318a = new ArrayList<>();

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() throws Throwable {
        MultiPartInputStream multiPartInputStream = new MultiPartInputStream();
        Iterator<HTTPPart> it = this.f41318a.iterator();
        while (it.hasNext()) {
            multiPartInputStream.addInputStream(it.next().a());
        }
        return multiPartInputStream;
    }

    public MultiPart append(HTTPPart hTTPPart) throws Throwable {
        this.f41318a.add(hTTPPart);
        return this;
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() throws Throwable {
        Iterator<HTTPPart> it = this.f41318a.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += it.next().b();
        }
        return j11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<HTTPPart> it = this.f41318a.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        return sb2.toString();
    }
}
