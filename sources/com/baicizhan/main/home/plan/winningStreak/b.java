package com.baicizhan.main.home.plan.winningStreak;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22991a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f22992b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f22993c = 0;

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: com.baicizhan.main.home.plan.winningStreak.b$b, reason: collision with other inner class name */
    public static final class C0317b extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22994c = 0;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TaskStatus f22995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0317b(@k TaskStatus status) {
            super(null);
            g0.p(status, "status");
            this.f22995b = status;
        }

        public static /* synthetic */ C0317b c(C0317b c0317b, TaskStatus taskStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                taskStatus = c0317b.f22995b;
            }
            return c0317b.b(taskStatus);
        }

        @k
        public final TaskStatus a() {
            return this.f22995b;
        }

        @k
        public final C0317b b(@k TaskStatus status) {
            g0.p(status, "status");
            return new C0317b(status);
        }

        @k
        public final TaskStatus d() {
            return this.f22995b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0317b) && this.f22995b == ((C0317b) obj).f22995b;
        }

        public int hashCode() {
            return this.f22995b.hashCode();
        }

        @k
        public String toString() {
            return "Task(status=" + this.f22995b + j.f81007d;
        }
    }

    public /* synthetic */ b(v vVar) {
        this();
    }

    public b() {
    }
}
