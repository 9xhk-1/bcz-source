package com.google.common.math;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@com.google.common.math.e
@go.d
@go.c
/* loaded from: classes7.dex */
public abstract class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final double f34325a;

        /* renamed from: b, reason: collision with root package name */
        public final double f34326b;

        public g a(double x22, double y22) {
            Preconditions.checkArgument(com.google.common.math.d.d(x22) && com.google.common.math.d.d(y22));
            double d11 = this.f34325a;
            if (x22 != d11) {
                return b((y22 - this.f34326b) / (x22 - d11));
            }
            Preconditions.checkArgument(y22 != this.f34326b);
            return new e(this.f34325a);
        }

        public g b(double slope) {
            Preconditions.checkArgument(!Double.isNaN(slope));
            return com.google.common.math.d.d(slope) ? new d(slope, this.f34326b - (this.f34325a * slope)) : new e(this.f34325a);
        }

        public b(double x12, double y12) {
            this.f34325a = x12;
            this.f34326b = y12;
        }
    }

    public static g a() {
        return c.f34327a;
    }

    public static g b(double y11) {
        Preconditions.checkArgument(com.google.common.math.d.d(y11));
        return new d(0.0d, y11);
    }

    public static b f(double x12, double y12) {
        Preconditions.checkArgument(com.google.common.math.d.d(x12) && com.google.common.math.d.d(y12));
        return new b(x12, y12);
    }

    public static g i(double x11) {
        Preconditions.checkArgument(com.google.common.math.d.d(x11));
        return new e(x11);
    }

    public abstract g c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract double g();

    public abstract double h(double x11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends g {

        /* renamed from: a, reason: collision with root package name */
        public final double f34331a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public g f34332b;

        public e(double x11) {
            this.f34331a = x11;
            this.f34332b = null;
        }

        private g j() {
            return new d(0.0d, this.f34331a, this);
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVar = this.f34332b;
            if (gVar != null) {
                return gVar;
            }
            g j11 = j();
            this.f34332b = j11;
            return j11;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return true;
        }

        @Override // com.google.common.math.g
        public double g() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.g
        public double h(double x11) {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f34331a));
        }

        public e(double x11, g inverse) {
            this.f34331a = x11;
            this.f34332b = inverse;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final double f34328a;

        /* renamed from: b, reason: collision with root package name */
        public final double f34329b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public g f34330c;

        public d(double slope, double yIntercept) {
            this.f34328a = slope;
            this.f34329b = yIntercept;
            this.f34330c = null;
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVar = this.f34330c;
            if (gVar != null) {
                return gVar;
            }
            g j11 = j();
            this.f34330c = j11;
            return j11;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return this.f34328a == 0.0d;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return this.f34328a;
        }

        @Override // com.google.common.math.g
        public double h(double x11) {
            return (x11 * this.f34328a) + this.f34329b;
        }

        public final g j() {
            double d11 = this.f34328a;
            return d11 != 0.0d ? new d(1.0d / d11, (this.f34329b * (-1.0d)) / d11, this) : new e(this.f34329b, this);
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f34328a), Double.valueOf(this.f34329b));
        }

        public d(double slope, double yIntercept, g inverse) {
            this.f34328a = slope;
            this.f34329b = yIntercept;
            this.f34330c = inverse;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f34327a = new c();

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return Double.NaN;
        }

        @Override // com.google.common.math.g
        public double h(double x11) {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.g
        public g c() {
            return this;
        }
    }
}
