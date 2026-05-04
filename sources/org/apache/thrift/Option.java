package org.apache.thrift;

import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class Option<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class None<T> extends Option<T> {
        @Override // org.apache.thrift.Option
        public T get() {
            throw new IllegalStateException("Cannot call get() on None");
        }

        @Override // org.apache.thrift.Option
        public boolean isDefined() {
            return false;
        }

        public String toString() {
            return "None";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Some<T> extends Option<T> {
        private final T value;

        public Some(T t11) {
            this.value = t11;
        }

        @Override // org.apache.thrift.Option
        public T get() {
            return this.value;
        }

        @Override // org.apache.thrift.Option
        public boolean isDefined() {
            return true;
        }

        public String toString() {
            return "Some(" + this.value.toString() + j.f81007d;
        }
    }

    public static <T> Option<T> fromNullable(T t11) {
        return t11 != null ? new Some(t11) : new None();
    }

    public static <T> None<T> none() {
        return new None<>();
    }

    public static <T> Some<T> some(T t11) {
        return new Some<>(t11);
    }

    public abstract T get();

    public abstract boolean isDefined();

    public T or(T t11) {
        return isDefined() ? get() : t11;
    }
}
