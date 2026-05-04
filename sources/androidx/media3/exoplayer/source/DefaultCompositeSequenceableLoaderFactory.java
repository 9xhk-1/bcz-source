package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultCompositeSequenceableLoaderFactory implements CompositeSequenceableLoaderFactory {
    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public SequenceableLoader create(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        return new CompositeSequenceableLoader(list, list2);
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    @Deprecated
    public SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr) {
        return new CompositeSequenceableLoader(sequenceableLoaderArr);
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public SequenceableLoader empty() {
        return new CompositeSequenceableLoader(ImmutableList.of(), ImmutableList.of());
    }
}
