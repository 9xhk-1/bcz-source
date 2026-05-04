package ij;

import androidx.lifecycle.LiveData;
import com.baicizhan.main.word_book.data.FavoriteInfo;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface e extends t, m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ Object w(e eVar, long j11, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFavoriteInfo");
        }
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return eVar.o(j11, cVar);
    }

    @m80.k
    LiveData<Throwable> F(boolean z11, @m80.k List<Long> list, @m80.k e0... e0VarArr);

    @m80.k
    LiveData<pj.b> M(boolean z11, @m80.k e0... e0VarArr);

    @m80.k
    LiveData<dg.d<List<FavoriteInfo>>> d0(long j11);

    @m80.l
    Object o(long j11, @m80.k j00.c<? super List<FavoriteInfo>> cVar);
}
