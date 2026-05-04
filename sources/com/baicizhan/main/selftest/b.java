package com.baicizhan.main.selftest;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import uh.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f25035b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<f> f25036a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f25037c = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k List<f> topics) {
            super(topics, null);
            g0.p(topics, "topics");
        }

        public /* synthetic */ a(List list, int i11, v vVar) {
            this((i11 & 1) != 0 ? h0.J() : list);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    /* renamed from: com.baicizhan.main.selftest.b$b, reason: collision with other inner class name */
    public static final class C0323b extends b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0323b f25038c = new C0323b();

        /* renamed from: d, reason: collision with root package name */
        public static final int f25039d = 8;

        public C0323b() {
            super(h0.J(), null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f25040c = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@k List<f> topics) {
            super(topics, null);
            g0.p(topics, "topics");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class d extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f25041c = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@k List<f> topics) {
            super(topics, null);
            g0.p(topics, "topics");
        }

        public /* synthetic */ d(List list, int i11, v vVar) {
            this((i11 & 1) != 0 ? h0.J() : list);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class e extends b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final e f25042c = new e();

        /* renamed from: d, reason: collision with root package name */
        public static final int f25043d = 8;

        public e() {
            super(h0.J(), null);
        }
    }

    public /* synthetic */ b(List list, v vVar) {
        this(list);
    }

    @k
    public final List<f> a() {
        return this.f25036a;
    }

    public b(List<f> list) {
        this.f25036a = list;
    }
}
