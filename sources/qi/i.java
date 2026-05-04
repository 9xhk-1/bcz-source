package qi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordMedia;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f82245b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f82246c = 8;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final WordMediaRecord f82247a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nwiki_data.kt\nKotlin\n*S Kotlin\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/WordVideoInfo$Companion\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,343:1\n18#2,3:344\n*S KotlinDebug\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/WordVideoInfo$Companion\n*L\n339#1:344,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final i a(@k TopicResourceV2 topicRes) {
            g0.p(topicRes, "topicRes");
            WordMedia wordMedia = topicRes.media;
            String str = wordMedia != null ? wordMedia.tv_path : null;
            if (str == null || str.length() == 0) {
                return null;
            }
            return new i(WordMediaRecord.fromWordMedia(topicRes.media));
        }

        public a() {
        }
    }

    public i(@l WordMediaRecord wordMediaRecord) {
        this.f82247a = wordMediaRecord;
    }

    public static /* synthetic */ i c(i iVar, WordMediaRecord wordMediaRecord, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wordMediaRecord = iVar.f82247a;
        }
        return iVar.b(wordMediaRecord);
    }

    @l
    public final WordMediaRecord a() {
        return this.f82247a;
    }

    @k
    public final i b(@l WordMediaRecord wordMediaRecord) {
        return new i(wordMediaRecord);
    }

    @l
    public final WordMediaRecord d() {
        return this.f82247a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && g0.g(this.f82247a, ((i) obj).f82247a);
    }

    public int hashCode() {
        WordMediaRecord wordMediaRecord = this.f82247a;
        if (wordMediaRecord == null) {
            return 0;
        }
        return wordMediaRecord.hashCode();
    }

    @k
    public String toString() {
        return "WordVideoInfo(media=" + this.f82247a + pn.j.f81007d;
    }
}
