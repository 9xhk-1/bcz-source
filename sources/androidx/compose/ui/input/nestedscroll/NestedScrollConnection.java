package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import j00.c;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @l
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m3602onPostFlingRZ2iAVY(@k NestedScrollConnection nestedScrollConnection, long j11, long j12, @k c<? super Velocity> cVar) {
            return NestedScrollConnection.super.mo497onPostFlingRZ2iAVY(j11, j12, cVar);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m3603onPostScrollDzOQY0M(@k NestedScrollConnection nestedScrollConnection, long j11, long j12, int i11) {
            return NestedScrollConnection.super.mo498onPostScrollDzOQY0M(j11, j12, i11);
        }

        @l
        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m3604onPreFlingQWom1Mo(@k NestedScrollConnection nestedScrollConnection, long j11, @k c<? super Velocity> cVar) {
            return NestedScrollConnection.super.mo803onPreFlingQWom1Mo(j11, cVar);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m3605onPreScrollOzD1aCk(@k NestedScrollConnection nestedScrollConnection, long j11, int i11) {
            return NestedScrollConnection.super.mo804onPreScrollOzD1aCk(j11, i11);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m3600onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j11, long j12, c<? super Velocity> cVar) {
        return Velocity.m5344boximpl(Velocity.Companion.m5364getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m3601onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j11, c<? super Velocity> cVar) {
        return Velocity.m5344boximpl(Velocity.Companion.m5364getZero9UxMQ8M());
    }

    @l
    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo497onPostFlingRZ2iAVY(long j11, long j12, @k c<? super Velocity> cVar) {
        return m3600onPostFlingRZ2iAVY$suspendImpl(this, j11, j12, cVar);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        return Offset.Companion.m2284getZeroF1C5BW0();
    }

    @l
    /* renamed from: onPreFling-QWom1Mo */
    default Object mo803onPreFlingQWom1Mo(long j11, @k c<? super Velocity> cVar) {
        return m3601onPreFlingQWom1Mo$suspendImpl(this, j11, cVar);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo804onPreScrollOzD1aCk(long j11, int i11) {
        return Offset.Companion.m2284getZeroF1C5BW0();
    }
}
