package ni;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.baicizhan.main.wikiv2.lookup.WordWikiFragment;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import e10.e;
import gs.r5;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import li.f;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class c extends Fragment implements li.c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f75133d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f75134e = 8;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f75135f = "study_wiki_topic_id";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f75136g = "study_wiki_book_id";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f75137a = "fragment_tag_collect_wiki";

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f75138b = e0.c(new x00.a() { // from class: ni.b
        @Override // x00.a
        public final Object invoke() {
            r5 x11;
            x11 = c.x(c.this);
            return x11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @l
    public f f75139c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final c a(int i11, int i12) {
            c cVar = new c();
            qb.c.i(cVar.f75137a, "topic " + i11 + j2.O + cVar.hashCode() + " ", new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putInt("study_wiki_topic_id", i11);
            bundle.putInt("study_wiki_book_id", i12);
            cVar.setArguments(bundle);
            return cVar;
        }

        public a() {
        }
    }

    public static final void A(WordWikiFragment wordWikiFragment, c cVar, View view) {
        wordWikiFragment.M();
        f fVar = cVar.f75139c;
        if (fVar != null) {
            f.o0(fVar, null, 1, null);
        }
    }

    public static final r5 x(c cVar) {
        r5 e11 = r5.e(LayoutInflater.from(cVar.getContext()), null, false);
        g0.o(e11, "inflate(...)");
        return e11;
    }

    public final void B(@l f fVar) {
        this.f75139c = fVar;
    }

    @Override // li.c
    public boolean d() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return false;
        }
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(this.f75137a + y().f56574c.getId());
        if (findFragmentByTag != null) {
            return ((WordWikiFragment) findFragmentByTag).g0();
        }
        return false;
    }

    @Override // li.c
    public void j(@l f fVar) {
        this.f75139c = fVar;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        return y().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        Bundle arguments = getArguments();
        int i11 = arguments != null ? arguments.getInt("study_wiki_topic_id") : 0;
        Bundle arguments2 = getArguments();
        int i12 = arguments2 != null ? arguments2.getInt("study_wiki_book_id") : 0;
        y().f56574c.setId(Math.abs(((Math.abs(e.b(System.nanoTime()).nextInt()) / 100000) * 100000) + i11));
        final WordWikiFragment e11 = WordWikiFragment.a.e(WordWikiFragment.f25562t, i11, i12, GetTopicResourceChannel.STUDY, 0, false, 8, null);
        getChildFragmentManager().beginTransaction().replace(y().f56574c.getId(), e11, this.f75137a + y().f56574c.getId()).commitAllowingStateLoss();
        y().f56573b.setOnClickListener(new View.OnClickListener() { // from class: ni.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.A(WordWikiFragment.this, this, view2);
            }
        });
    }

    @Override // li.c
    public void q() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(this.f75137a + y().f56574c.getId());
            if (findFragmentByTag != null) {
                ((WordWikiFragment) findFragmentByTag).f0();
            }
        }
    }

    @k
    public final r5 y() {
        return (r5) this.f75138b.getValue();
    }

    @l
    public final f z() {
        return this.f75139c;
    }
}
