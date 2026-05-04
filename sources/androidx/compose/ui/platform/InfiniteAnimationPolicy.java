package androidx.compose.ui.platform;

import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface InfiniteAnimationPolicy extends d.b {

    @m80.k
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        public static <R> R fold(@m80.k InfiniteAnimationPolicy infiniteAnimationPolicy, R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(infiniteAnimationPolicy, r11, pVar);
        }

        @m80.l
        public static <E extends d.b> E get(@m80.k InfiniteAnimationPolicy infiniteAnimationPolicy, @m80.k d.c<E> cVar) {
            return (E) d.b.a.b(infiniteAnimationPolicy, cVar);
        }

        @Deprecated
        @m80.k
        public static d.c<?> getKey(@m80.k InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        @m80.k
        public static kotlin.coroutines.d minusKey(@m80.k InfiniteAnimationPolicy infiniteAnimationPolicy, @m80.k d.c<?> cVar) {
            return d.b.a.c(infiniteAnimationPolicy, cVar);
        }

        @m80.k
        public static kotlin.coroutines.d plus(@m80.k InfiniteAnimationPolicy infiniteAnimationPolicy, @m80.k kotlin.coroutines.d dVar) {
            return d.b.a.d(infiniteAnimationPolicy, dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements d.c<InfiniteAnimationPolicy> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.d.b
    @m80.k
    default d.c<?> getKey() {
        return Key;
    }

    @m80.l
    <R> Object onInfiniteOperation(@m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar, @m80.k j00.c<? super R> cVar);
}
