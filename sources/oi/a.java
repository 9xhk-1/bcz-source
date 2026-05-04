package oi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.CollectWordRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.main.wikiv2.lookup.WikiType;
import com.baicizhan.online.user_study_api.WikiComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiHelper.kt\ncom/baicizhan/main/wikiv2/lookup/WikiHelper\n+ 2 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n16#2,2:78\n18#2:82\n16#2,2:83\n18#2:87\n295#3,2:80\n295#3,2:85\n295#3,2:88\n*S KotlinDebug\n*F\n+ 1 WikiHelper.kt\ncom/baicizhan/main/wikiv2/lookup/WikiHelper\n*L\n37#1:78,2\n37#1:82\n41#1:83,2\n41#1:87\n38#1:80,2\n42#1:85,2\n58#1:88,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final C0940a f76984b = new C0940a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f76985c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final List<WikiComponent> f76986a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: oi.a$a, reason: collision with other inner class name */
    public static final class C0940a {
        public /* synthetic */ C0940a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final CollectWordRecord a(@m80.k qi.b info) {
            g0.p(info, "info");
            CollectWordRecord collectWordRecord = new CollectWordRecord();
            collectWordRecord.universeTopicId = UniverseTopicId.make(info.p(), info.u());
            collectWordRecord.word = info.z();
            collectWordRecord.meanCn = info.q();
            collectWordRecord.accent = info.x();
            collectWordRecord.audio = info.y();
            return collectWordRecord;
        }

        public C0940a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@m80.l List<? extends WikiComponent> list) {
        this.f76986a = list;
    }

    public final int a(@m80.k WikiType wikiType) {
        g0.p(wikiType, "wikiType");
        List<WikiComponent> list = this.f76986a;
        Integer num = null;
        Object obj = null;
        num = null;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (wikiType.getId() == ((WikiComponent) next).f28170id) {
                    obj = next;
                    break;
                }
            }
            WikiComponent wikiComponent = (WikiComponent) obj;
            num = Integer.valueOf(wikiComponent != null ? wikiComponent.priority : 0);
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @m80.l
    public final Pair<Boolean, Integer> b(@m80.k WikiType wikiType) {
        Object obj;
        g0.p(wikiType, "wikiType");
        List<WikiComponent> list = this.f76986a;
        if (list == null) {
            return new Pair<>(Boolean.TRUE, 0);
        }
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = this.f76986a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (wikiType.getId() == ((WikiComponent) obj).f28170id) {
                break;
            }
        }
        WikiComponent wikiComponent = (WikiComponent) obj;
        if (wikiComponent != null) {
            return new Pair<>(Boolean.valueOf(wikiComponent.enable == 1), Integer.valueOf(wikiComponent.priority));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(@m80.k WikiType wikiType) {
        g0.p(wikiType, "wikiType");
        List<WikiComponent> list = this.f76986a;
        Boolean bool = null;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (wikiType.getId() == ((WikiComponent) next).f28170id) {
                    bool = next;
                    break;
                }
            }
            bool = Boolean.valueOf(bool != null);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
