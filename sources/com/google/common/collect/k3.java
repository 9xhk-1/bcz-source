package com.google.common.collect;

import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final k3 f33564a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final k3 f33565b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final k3 f33566c = new b(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k3 {
        public a() {
            super(null);
        }

        @Override // com.google.common.collect.k3
        public k3 d(double left, double right) {
            return o(Double.compare(left, right));
        }

        @Override // com.google.common.collect.k3
        public k3 e(float left, float right) {
            return o(Float.compare(left, right));
        }

        @Override // com.google.common.collect.k3
        public k3 f(int left, int right) {
            return o(Integer.compare(left, right));
        }

        @Override // com.google.common.collect.k3
        public k3 g(long left, long right) {
            return o(Long.compare(left, right));
        }

        @Override // com.google.common.collect.k3
        public k3 i(Comparable<?> left, Comparable<?> right) {
            return o(left.compareTo(right));
        }

        @Override // com.google.common.collect.k3
        public <T> k3 j(@t7 T left, @t7 T right, Comparator<T> comparator) {
            return o(comparator.compare(left, right));
        }

        @Override // com.google.common.collect.k3
        public k3 k(boolean left, boolean right) {
            return o(Boolean.compare(left, right));
        }

        @Override // com.google.common.collect.k3
        public k3 l(boolean left, boolean right) {
            return o(Boolean.compare(right, left));
        }

        @Override // com.google.common.collect.k3
        public int m() {
            return 0;
        }

        public k3 o(int result) {
            return result < 0 ? k3.f33565b : result > 0 ? k3.f33566c : k3.f33564a;
        }
    }

    public /* synthetic */ k3(a aVar) {
        this();
    }

    public static k3 n() {
        return f33564a;
    }

    public abstract k3 d(double left, double right);

    public abstract k3 e(float left, float right);

    public abstract k3 f(int left, int right);

    public abstract k3 g(long left, long right);

    @Deprecated
    public final k3 h(Boolean left, Boolean right) {
        return k(left.booleanValue(), right.booleanValue());
    }

    public abstract k3 i(Comparable<?> left, Comparable<?> right);

    public abstract <T> k3 j(@t7 T left, @t7 T right, Comparator<T> comparator);

    public abstract k3 k(boolean left, boolean right);

    public abstract k3 l(boolean left, boolean right);

    public abstract int m();

    public k3() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends k3 {

        /* renamed from: d, reason: collision with root package name */
        public final int f33567d;

        public b(int result) {
            super(null);
            this.f33567d = result;
        }

        @Override // com.google.common.collect.k3
        public int m() {
            return this.f33567d;
        }

        @Override // com.google.common.collect.k3
        public k3 d(double left, double right) {
            return this;
        }

        @Override // com.google.common.collect.k3
        public k3 e(float left, float right) {
            return this;
        }

        @Override // com.google.common.collect.k3
        public k3 f(int left, int right) {
            return this;
        }

        @Override // com.google.common.collect.k3
        public k3 g(long left, long right) {
            return this;
        }

        @Override // com.google.common.collect.k3
        public k3 i(Comparable<?> left, Comparable<?> right) {
            return this;
        }

        @Override // com.google.common.collect.k3
        public k3 k(boolean left, boolean right) {
            return this;
        }

        @Override // com.google.common.collect.k3
        public k3 l(boolean left, boolean right) {
            return this;
        }

        @Override // com.google.common.collect.k3
        public <T> k3 j(@t7 T left, @t7 T right, Comparator<T> comparator) {
            return this;
        }
    }
}
