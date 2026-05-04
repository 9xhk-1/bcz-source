package qi;

import android.text.TextUtils;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.VariantInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public String f82243a;

    /* renamed from: b, reason: collision with root package name */
    public List<ExtendedWordInfo.WordDeform> f82244b;

    public static List<ExtendedWordInfo.WordDeform> a(List<ExtendedWordInfo.WordDeform> deforms, String deform, String type) {
        if (TextUtils.isEmpty(deform)) {
            return deforms;
        }
        if (deforms == null) {
            deforms = new ArrayList<>();
        }
        ExtendedWordInfo.WordDeform wordDeform = new ExtendedWordInfo.WordDeform();
        wordDeform.f25874a = type;
        wordDeform.f25875b = deform;
        deforms.add(wordDeform);
        return deforms;
    }

    public static h b(TopicResourceV2 resourceV2) {
        return c(resourceV2, false);
    }

    public static h c(TopicResourceV2 resourceV2, boolean useWiki) {
        if (resourceV2 == null) {
            return null;
        }
        if (!useWiki && (resourceV2.getDict() == null || resourceV2.getDict().variant_info == null)) {
            return null;
        }
        if (useWiki && (resourceV2.getDict_wiki() == null || resourceV2.getDict_wiki().dict == null || resourceV2.getDict_wiki().dict.variant_info == null)) {
            return null;
        }
        VariantInfo variantInfo = (useWiki ? resourceV2.getDict_wiki().getDict() : resourceV2.getDict()).variant_info;
        h hVar = new h();
        ArrayList arrayList = new ArrayList();
        hVar.f82244b = arrayList;
        List<ExtendedWordInfo.WordDeform> a11 = a(arrayList, variantInfo.f28163pl, ExtendedWordInfo.WordDeform.f25861c);
        hVar.f82244b = a11;
        List<ExtendedWordInfo.WordDeform> a12 = a(a11, variantInfo.third, ExtendedWordInfo.WordDeform.f25862d);
        hVar.f82244b = a12;
        List<ExtendedWordInfo.WordDeform> a13 = a(a12, variantInfo.ing, ExtendedWordInfo.WordDeform.f25863e);
        hVar.f82244b = a13;
        List<ExtendedWordInfo.WordDeform> a14 = a(a13, variantInfo.past, ExtendedWordInfo.WordDeform.f25864f);
        hVar.f82244b = a14;
        List<ExtendedWordInfo.WordDeform> a15 = a(a14, variantInfo.done, ExtendedWordInfo.WordDeform.f25865g);
        hVar.f82244b = a15;
        List<ExtendedWordInfo.WordDeform> a16 = a(a15, variantInfo.f28162er, ExtendedWordInfo.WordDeform.f25866h);
        hVar.f82244b = a16;
        List<ExtendedWordInfo.WordDeform> a17 = a(a16, variantInfo.est, ExtendedWordInfo.WordDeform.f25867i);
        hVar.f82244b = a17;
        List<ExtendedWordInfo.WordDeform> a18 = a(a17, variantInfo.verb, ExtendedWordInfo.WordDeform.f25868j);
        hVar.f82244b = a18;
        List<ExtendedWordInfo.WordDeform> a19 = a(a18, variantInfo.noun, ExtendedWordInfo.WordDeform.f25869k);
        hVar.f82244b = a19;
        List<ExtendedWordInfo.WordDeform> a21 = a(a19, variantInfo.adj, ExtendedWordInfo.WordDeform.f25870l);
        hVar.f82244b = a21;
        List<ExtendedWordInfo.WordDeform> a22 = a(a21, variantInfo.adv, ExtendedWordInfo.WordDeform.f25871m);
        hVar.f82244b = a22;
        List<ExtendedWordInfo.WordDeform> a23 = a(a22, variantInfo.prep, ExtendedWordInfo.WordDeform.f25872n);
        hVar.f82244b = a23;
        hVar.f82244b = a(a23, variantInfo.conn, ExtendedWordInfo.WordDeform.f25873o);
        hVar.f82243a = (useWiki ? resourceV2.getDict_wiki().dict : resourceV2.getDict()).getWord_basic_info().word;
        return hVar;
    }

    public List<ExtendedWordInfo.WordDeform> d() {
        return this.f82244b;
    }
}
