package yy;

import c40.h1;
import c40.q0;
import c40.s0;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.q;
import java.io.Closeable;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", f = "FileChannelsAtNioPath.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nFileChannelsAtNioPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannelsAtNioPath.kt\nio/ktor/util/cio/FileChannelsAtNioPathKt$readChannel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    public static final class a extends SuspendLambda implements p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100374a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100375b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f100376c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f100377d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f100378e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Path f100379f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, long j12, long j13, Path path, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f100376c = j11;
            this.f100377d = j12;
            this.f100378e = j13;
            this.f100379f = path;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f100376c, this.f100377d, this.f100378e, this.f100379f, cVar);
            aVar.f100375b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SeekableByteChannel newByteChannel;
            Throwable th2;
            Closeable closeable;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f100374a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                m0 m0Var = (m0) this.f100375b;
                long j11 = this.f100376c;
                if (!(j11 >= 0)) {
                    throw new IllegalArgumentException(("start position shouldn't be negative but it is " + j11).toString());
                }
                long j12 = this.f100377d;
                long j13 = this.f100378e;
                if (!(j12 <= j13 - 1)) {
                    throw new IllegalArgumentException(("endInclusive points to the position out of the file: file size = " + j13 + ", endInclusive = " + j12).toString());
                }
                newByteChannel = Files.newByteChannel(this.f100379f, new OpenOption[0]);
                long j14 = this.f100376c;
                long j15 = this.f100377d;
                try {
                    g0.m(newByteChannel);
                    this.f100375b = newByteChannel;
                    this.f100374a = 1;
                    if (f.k(newByteChannel, m0Var, j14, j15, this) == l11) {
                        return l11;
                    }
                    closeable = newByteChannel;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = newByteChannel;
                    throw th2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f100375b;
                try {
                    kotlin.e.n(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        r00.b.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            g2 g2Var = g2.f100423a;
            r00.b.a(closeable, null);
            return g2Var;
        }
    }

    @k
    public static final io.ktor.utils.io.g a(@k Path path, long j11, long j12, @k kotlin.coroutines.d coroutineContext) {
        long size;
        g0.p(path, "<this>");
        g0.p(coroutineContext, "coroutineContext");
        size = Files.size(path);
        return q.C(s0.a(coroutineContext), new q0("file-reader").plus(coroutineContext), false, new a(j11, j12, size, path, null)).b();
    }

    public static /* synthetic */ io.ktor.utils.io.g b(Path path, long j11, long j12, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = -1;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            dVar = h1.c();
        }
        return a(path, j13, j14, dVar);
    }
}
