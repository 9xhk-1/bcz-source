package com.baicizhan.client.framework.asynctask;

import java.security.InvalidParameterException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LAsyncTaskParallel {

    /* renamed from: a, reason: collision with root package name */
    public a f17527a;

    /* renamed from: b, reason: collision with root package name */
    public LAsyncTaskParallelType f17528b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LAsyncTaskParallelType {
        SERIAL,
        TWO_PARALLEL,
        THREE_PARALLEL,
        FOUR_PARALLEL,
        MAX_PARALLEL
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f17529b = 1000;

        /* renamed from: c, reason: collision with root package name */
        public static int f17530c = 1000;

        /* renamed from: a, reason: collision with root package name */
        public int f17531a = 0;

        public static synchronized a b() {
            a aVar;
            synchronized (a.class) {
                aVar = new a();
                int i11 = f17530c;
                aVar.f17531a = i11;
                f17530c = i11 + 1;
            }
            return aVar;
        }
    }

    public LAsyncTaskParallel(LAsyncTaskParallelType type, a tag) {
        this.f17527a = null;
        this.f17528b = LAsyncTaskParallelType.MAX_PARALLEL;
        if (type == null || tag == null) {
            throw new InvalidParameterException("LAsyncTaskParallel parameter null");
        }
        this.f17528b = type;
        this.f17527a = tag;
    }

    public int a() {
        return this.f17527a.f17531a;
    }

    public LAsyncTaskParallelType b() {
        return this.f17528b;
    }
}
