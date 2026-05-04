package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.ReflectHelper;
import java.io.InputStream;

/* loaded from: classes7.dex */
public abstract class HTTPPart implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private long f41314a;

    /* renamed from: b, reason: collision with root package name */
    private OnReadListener f41315b;

    public abstract InputStream a() throws Throwable;

    public abstract long b() throws Throwable;

    public Object getInputStreamEntity() throws Throwable {
        InputStream inputStream = toInputStream();
        long b11 = b() - this.f41314a;
        ReflectHelper.importClass("org.apache.http.entity.InputStreamEntity");
        return ReflectHelper.newInstance("InputStreamEntity", inputStream, Long.valueOf(b11));
    }

    public void setOffset(long j11) {
        this.f41314a = j11;
    }

    public void setOnReadListener(OnReadListener onReadListener) {
        this.f41315b = onReadListener;
    }

    public InputStream toInputStream() throws Throwable {
        return new ByteCounterInputStream(a());
    }
}
