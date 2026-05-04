package ri;

import a00.h0;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.bumptech.glide.load.engine.GlideException;
import f9.a;
import gi.m0;
import gs.ke;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiScenePhraseAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiScenePhraseAdapter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/adapter/WikiScenePhraseAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1869#2,2:208\n*S KotlinDebug\n*F\n+ 1 WikiScenePhraseAdapter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/adapter/WikiScenePhraseAdapter\n*L\n81#1:208,2\n*E\n"})
/* loaded from: classes3.dex */
public final class i extends RecyclerView.Adapter<c> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f84124d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f84125e = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f84126f = "LookupPhraseAdapter";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f84127a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0 f84128b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<b> f84129c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final String a(int i11) {
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? "其他" : "主题" : "语境" : "基础";
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f84130d = 8;

        /* renamed from: a, reason: collision with root package name */
        public final int f84131a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f84132b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<i0.r> f84133c;

        public b(int i11, @m80.k String tagName, @m80.k List<i0.r> phrases) {
            g0.p(tagName, "tagName");
            g0.p(phrases, "phrases");
            this.f84131a = i11;
            this.f84132b = tagName;
            this.f84133c = phrases;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b e(b bVar, int i11, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f84131a;
            }
            if ((i12 & 2) != 0) {
                str = bVar.f84132b;
            }
            if ((i12 & 4) != 0) {
                list = bVar.f84133c;
            }
            return bVar.d(i11, str, list);
        }

        public final int a() {
            return this.f84131a;
        }

        @m80.k
        public final String b() {
            return this.f84132b;
        }

        @m80.k
        public final List<i0.r> c() {
            return this.f84133c;
        }

        @m80.k
        public final b d(int i11, @m80.k String tagName, @m80.k List<i0.r> phrases) {
            g0.p(tagName, "tagName");
            g0.p(phrases, "phrases");
            return new b(i11, tagName, phrases);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f84131a == bVar.f84131a && g0.g(this.f84132b, bVar.f84132b) && g0.g(this.f84133c, bVar.f84133c);
        }

        @m80.k
        public final List<i0.r> f() {
            return this.f84133c;
        }

        public final int g() {
            return this.f84131a;
        }

        @m80.k
        public final String h() {
            return this.f84132b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f84131a) * 31) + this.f84132b.hashCode()) * 31) + this.f84133c.hashCode();
        }

        @m80.k
        public String toString() {
            return "PhraseGroup(tag=" + this.f84131a + ", tagName=" + this.f84132b + ", phrases=" + this.f84133c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends li.b<ke> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f84134e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k i iVar, ke binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f84134e = iVar;
        }

        @m80.k
        public final ke i() {
            return b();
        }
    }

    public i(@m80.k LifecycleOwner lifecycleOwner, @m80.k o0 viewModel) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f84127a = lifecycleOwner;
        this.f84128b = viewModel;
        this.f84129c = h0.J();
    }

    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, i0.r rVar, String str) {
        TextView textView = new TextView(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, KotlinExtKt.getDpValue(12));
        textView.setLayoutParams(layoutParams);
        textView.setLineSpacing(KotlinExtKt.getDpValue(6), 1.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String k11 = rVar.k();
        int length = k11.length();
        spannableStringBuilder.append((CharSequence) k11);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), 0, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#141822")), 0, length, 33);
        ArrayList arrayList = new ArrayList();
        if (str.length() > 0) {
            Locale locale = Locale.ROOT;
            String lowerCase = k11.toLowerCase(locale);
            g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(locale);
            g0.o(lowerCase2, "toLowerCase(...)");
            int J3 = k0.J3(lowerCase, lowerCase2, 0, false, 6, null);
            while (J3 >= 0) {
                int length2 = J3 + str.length();
                spannableStringBuilder.setSpan(new StyleSpan(1), J3, length2, 33);
                arrayList.add(new a.b(J3, length2));
                J3 = k0.J3(lowerCase, lowerCase2, length2, false, 4, null);
            }
        }
        spannableStringBuilder.append((CharSequence) GlideException.a.f28776d);
        String i11 = rVar.i();
        int length3 = spannableStringBuilder.length();
        int length4 = i11.length() + length3;
        spannableStringBuilder.append((CharSequence) i11);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(14, true), length3, length4, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#606A7E")), length3, length4, 33);
        if (this.f84128b.K()) {
            m0.e(textView, spannableStringBuilder, arrayList);
        }
        textView.setText(spannableStringBuilder);
        return textView;
    }

    @m80.k
    public final List<b> c() {
        return this.f84129c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k c holder, int i11) {
        String str;
        g0.p(holder, "holder");
        b bVar = this.f84129c.get(i11);
        ke i12 = holder.i();
        i12.f55609a.setText(bVar.h());
        i12.f55610b.removeAllViews();
        si.c value = this.f84128b.I().getValue();
        if (value == null || (str = value.t()) == null) {
            str = "";
        }
        LayoutInflater from = LayoutInflater.from(i12.getRoot().getContext());
        for (i0.r rVar : bVar.f()) {
            g0.m(from);
            LinearLayout phrasesContainer = i12.f55610b;
            g0.o(phrasesContainer, "phrasesContainer");
            i12.f55610b.addView(b(from, phrasesContainer, rVar, str));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        ke e11 = ke.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new c(this, e11);
    }

    public final void g(@m80.k List<b> value) {
        g0.p(value, "value");
        this.f84129c = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84129c.size();
    }
}
