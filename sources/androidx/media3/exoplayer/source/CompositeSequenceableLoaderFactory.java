package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface CompositeSequenceableLoaderFactory {
    SequenceableLoader create(List<? extends SequenceableLoader> list, List<List<Integer>> list2);

    @Deprecated
    SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr);

    SequenceableLoader empty();
}
