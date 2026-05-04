package fj;

import a00.h0;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.s0;
import com.jiongji.andriod.card.R;
import gs.bg;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiFlowRadioBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiFlowRadioBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiFlowRadioBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1878#2,3:70\n*S KotlinDebug\n*F\n+ 1 WikiFlowRadioBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiFlowRadioBinder\n*L\n35#1:70,3\n*E\n"})
/* loaded from: classes3.dex */
public final class i extends li.e<s0, a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f51921f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final StudyWikiV2ViewModel f51922e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<bg> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f51923e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k i iVar, bg itemBinding) {
            super(itemBinding);
            g0.p(itemBinding, "itemBinding");
            this.f51923e = iVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.k LifecycleOwner life, @m80.k StudyWikiV2ViewModel vm2) {
        super(life);
        g0.p(life, "life");
        g0.p(vm2, "vm");
        this.f51922e = vm2;
    }

    public static final void A(i iVar, a aVar, Map map, RadioGroup radioGroup, int i11) {
        StudyWikiV2ViewModel studyWikiV2ViewModel = iVar.f51922e;
        int adapterPosition = aVar.getAdapterPosition() + 1;
        Integer num = (Integer) map.get(Integer.valueOf(i11));
        studyWikiV2ViewModel.y(adapterPosition, num != null ? num.intValue() : 0);
    }

    public static final void z(RadioButton radioButton, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            radioButton.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            radioButton.setTypeface(Typeface.DEFAULT);
        }
    }

    @Override // li.e
    @m80.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        bg e11 = bg.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }

    @m80.k
    public final StudyWikiV2ViewModel x() {
        return this.f51922e;
    }

    @Override // p50.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k final a holder, @m80.k s0 data) {
        g0.p(holder, "holder");
        g0.p(data, "data");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        bg b11 = holder.b();
        int i11 = 0;
        for (Object obj : data.d()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            final RadioButton radioButton = new RadioButton(b11.getRoot().getContext());
            radioButton.setText((String) obj);
            radioButton.setButtonDrawable((Drawable) null);
            radioButton.setBackgroundResource(R.drawable.bg_radio_selector_20dp);
            radioButton.setTextColor(b11.getRoot().getContext().getResources().getColorStateList(R.color.bg_wiki_radio_text_selector, null));
            radioButton.setTextSize(1, 12.0f);
            radioButton.setPadding(KotlinExtKt.getDpPixels(8), KotlinExtKt.getDpPixels(3), KotlinExtKt.getDpPixels(8), KotlinExtKt.getDpPixels(2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, KotlinExtKt.getDpPixels(23));
            layoutParams.leftMargin = KotlinExtKt.getDpPixels(16);
            layoutParams.bottomMargin = KotlinExtKt.getDpPixels(12);
            radioButton.setLayoutParams(layoutParams);
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fj.g
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    i.z(radioButton, compoundButton, z11);
                }
            });
            b11.f54288a.addView(radioButton);
            linkedHashMap.put(Integer.valueOf(radioButton.getId()), Integer.valueOf(i11));
            if (i11 == 0) {
                b11.f54288a.check(radioButton.getId());
                radioButton.setChecked(true);
            }
            i11 = i12;
        }
        b11.f54288a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: fj.h
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i13) {
                i.A(i.this, holder, linkedHashMap, radioGroup, i13);
            }
        });
        o(holder);
    }
}
