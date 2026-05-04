package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id, reason: collision with root package name */
    public final String f5226id;

    public Id3Frame(String str) {
        this.f5226id = str;
    }

    public String toString() {
        return this.f5226id;
    }
}
