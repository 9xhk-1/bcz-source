package i7;

import com.baicizhan.app.biz.synservice.SynTaskType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {b.class})
@u0({"SMAP\nISynTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ISynTask.kt\ncom/baicizhan/app/biz/synservice/SynTaskFactory\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,72:1\n45#2,2:73\n48#2:76\n41#2,6:78\n48#2:85\n142#3:75\n142#3:84\n127#4:77\n127#4:86\n*S KotlinDebug\n*F\n+ 1 ISynTask.kt\ncom/baicizhan/app/biz/synservice/SynTaskFactory\n*L\n67#1:73,2\n67#1:76\n68#1:78,6\n68#1:85\n67#1:75\n68#1:84\n67#1:77\n68#1:86\n*E\n"})
/* loaded from: classes3.dex */
public final class j implements b, c4.j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60245a;

        static {
            int[] iArr = new int[SynTaskType.values().length];
            try {
                iArr[SynTaskType.SYNC_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SynTaskType.SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60245a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ya0.a c(j jVar, String str) {
        return ya0.b.d((jVar instanceof pa0.c ? ((pa0.c) jVar).getScope() : jVar.r().P().h()).i(o0.d(i7.a.class), za0.b.e(str), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i7.b
    @l
    public Object a(@k SynTaskType synTaskType, @k j00.c<? super i7.a> cVar) {
        final String str;
        int i11 = a.f60245a[synTaskType.ordinal()];
        if (i11 == 1) {
            str = c.f60213a;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = c.f60214b;
        }
        return (i7.a) (this instanceof pa0.c ? ((pa0.c) this).getScope() : r().P().h()).i(o0.d(i7.a.class), za0.b.e(c.f60215c), new x00.a() { // from class: i7.i
            @Override // x00.a
            public final Object invoke() {
                ya0.a c11;
                c11 = j.c(j.this, str);
                return c11;
            }
        });
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
