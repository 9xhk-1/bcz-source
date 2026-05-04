package xi;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.jiongji.andriod.card.R;
import gs.kn;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import xi.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nStudyBasicWordBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyBasicWordBinder.kt\ncom/baicizhan/main/wikiv2/study/binder/StudyBasicWordBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1869#2,2:134\n*S KotlinDebug\n*F\n+ 1 StudyBasicWordBinder.kt\ncom/baicizhan/main/wikiv2/study/binder/StudyBasicWordBinder\n*L\n94#1:134,2\n*E\n"})
/* loaded from: classes3.dex */
public final class f extends li.e<com.baicizhan.main.wikiv2.study.model.c, a> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f98076g = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final wi.n f98077e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final FragmentActivity f98078f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nStudyBasicWordBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyBasicWordBinder.kt\ncom/baicizhan/main/wikiv2/study/binder/StudyBasicWordBinder$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public final class a extends li.b<kn> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f98079e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k f fVar, kn binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f98079e = fVar;
        }

        public static final void o(f fVar, com.baicizhan.main.wikiv2.study.model.c cVar, View view) {
            fVar.f98077e.s(cVar);
        }

        public static final void p(f fVar, com.baicizhan.main.wikiv2.study.model.c cVar, View view) {
            fVar.f98077e.s(cVar);
            wi.n.f(fVar.f98077e, ma.a.C4, null, 2, null);
        }

        public static final void q(kn knVar, com.baicizhan.main.wikiv2.study.model.c cVar, List it) {
            g0.p(it, "it");
            knVar.f55655f.setImageResource(g.a(it.contains(Integer.valueOf(cVar.i().topicId))));
        }

        public static final g2 r(f fVar, com.baicizhan.main.wikiv2.study.model.c cVar, final kn knVar, View it) {
            g0.p(it, "it");
            hj.m l02 = fVar.f98077e.l0();
            if (l02 != null) {
                l02.r(nj.a.f75140b.a(cVar.i()), new hj.o() { // from class: xi.a
                    @Override // hj.o
                    public final void a(Boolean bool, long[] jArr) {
                        f.a.s(kn.this, bool, jArr);
                    }
                });
            }
            wi.n.f(fVar.f98077e, ma.a.B4, null, 2, null);
            return g2.f100423a;
        }

        public static final void s(kn knVar, Boolean bool, long[] jArr) {
            g0.p(jArr, "<unused var>");
            ImageView imageView = knVar.f55655f;
            if (bool != null) {
                imageView.setImageResource(g.a(bool.booleanValue()));
            }
        }

        public final void n(@m80.k final com.baicizhan.main.wikiv2.study.model.c basicWord) {
            int i11;
            SpannableStringBuilder A;
            g0.p(basicWord, "basicWord");
            kn b11 = b();
            final f fVar = this.f98079e;
            final kn knVar = b11;
            knVar.f55658i.setOnClickListener(new View.OnClickListener() { // from class: xi.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.a.o(f.this, basicWord, view);
                }
            });
            knVar.f55651b.setOnClickListener(new View.OnClickListener() { // from class: xi.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.a.p(f.this, basicWord, view);
                }
            });
            hj.m l02 = fVar.f98077e.l0();
            if (l02 != null) {
                l02.D(new hj.a() { // from class: xi.d
                    @Override // hj.a
                    public final void onResult(Object obj) {
                        f.a.q(kn.this, basicWord, (List) obj);
                    }
                });
            } else {
                knVar.f55655f.setImageResource(g.a(false));
            }
            FrameLayout collect = knVar.f55654e;
            g0.o(collect, "collect");
            sa.q.t(collect, 0, new x00.l() { // from class: xi.e
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 r11;
                    r11 = f.a.r(f.this, basicWord, knVar, (View) obj);
                    return r11;
                }
            }, 1, null);
            knVar.f55650a.setText(basicWord.b());
            ImageView imageView = knVar.f55652c;
            if (basicWord.g() != null) {
                Integer num = 0;
                i11 = num.intValue();
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            knVar.f55658i.setText(basicWord.e());
            knVar.f55653d.setText(basicWord.c());
            knVar.f55657h.setVisibility(8);
            List<ExtendedWordInfo.WordDeform> d11 = basicWord.d();
            if (d11 != null && (A = fVar.A(d11)) != null) {
                knVar.f55657h.setVisibility(0);
                knVar.f55657h.setText(A);
            }
            ImageView accentVoice = knVar.f55652c;
            g0.o(accentVoice, "accentVoice");
            yi.b.b(accentVoice, this, basicWord.h());
            knVar.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@m80.k LifecycleOwner lifecycleOwner, @m80.k wi.n viewModel, @m80.k FragmentActivity activity) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        g0.p(activity, "activity");
        this.f98077e = viewModel;
        this.f98078f = activity;
    }

    public final SpannableStringBuilder A(List<? extends ExtendedWordInfo.WordDeform> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (ExtendedWordInfo.WordDeform wordDeform : list) {
            spannableStringBuilder.append((CharSequence) (wordDeform.f25874a + "   "));
            if (g0.g(" ", wordDeform.f25874a)) {
                spannableStringBuilder.replace(spannableStringBuilder.length() - (wordDeform.f25874a.length() + 3), spannableStringBuilder.length(), (CharSequence) "---");
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(5), spannableStringBuilder.length() - 3, spannableStringBuilder.length(), 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(pb.a.a().getResources().getColor(R.color.main_color_common_background)), spannableStringBuilder.length() - 3, spannableStringBuilder.length(), 18);
                spannableStringBuilder.append((CharSequence) "\n");
            } else {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(xb.f.a(pb.a.a(), 14.0f)), spannableStringBuilder.length() - (wordDeform.f25874a.length() + 3), spannableStringBuilder.length(), 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(pb.a.a().getResources().getColor(R.color.main_color_word_b8)), spannableStringBuilder.length() - (wordDeform.f25874a.length() + 3), spannableStringBuilder.length() - 3, 18);
                spannableStringBuilder.append((CharSequence) (wordDeform.f25875b + "\n"));
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(xb.f.a(pb.a.a(), 14.0f)), spannableStringBuilder.length() - (wordDeform.f25875b.length() + 1), spannableStringBuilder.length() + (-1), 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(pb.a.a().getResources().getColor(R.color.main_color_main_word)), spannableStringBuilder.length() - (wordDeform.f25875b.length() + 1), spannableStringBuilder.length() + (-1), 18);
            }
        }
        if (spannableStringBuilder.length() == 0) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder delete = spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        g0.m(delete);
        return delete;
    }

    @Override // p50.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.study.model.c item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        holder.n(item);
        o(holder);
    }

    @Override // li.e
    @m80.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        return new a(this, (kn) wi.p.f96399a.b(kn.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(kn.class, holder.b());
    }
}
