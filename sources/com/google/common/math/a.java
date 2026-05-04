package com.google.common.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.d
@go.c
/* loaded from: classes7.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.math.a$a, reason: collision with other inner class name */
    public static class C0422a extends n<BigDecimal> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0422a f34294a = new C0422a();

        @Override // com.google.common.math.n
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(BigDecimal a11, BigDecimal b11) {
            return a11.subtract(b11);
        }

        @Override // com.google.common.math.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        @Override // com.google.common.math.n
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // com.google.common.math.n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(double d11, RoundingMode mode) {
            return new BigDecimal(d11);
        }
    }

    public static double a(BigDecimal x11, RoundingMode mode) {
        return C0422a.f34294a.b(x11, mode);
    }
}
