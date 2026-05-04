package androidx.databinding.adapters;

import androidx.annotation.RestrictTo;
import androidx.cardview.widget.CardView;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@BindingMethods({@BindingMethod(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @BindingMethod(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @BindingMethod(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @BindingMethod(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class CardViewBindingAdapter {
    @BindingAdapter({"contentPadding"})
    public static void setContentPadding(CardView cardView, int i11) {
        cardView.setContentPadding(i11, i11, i11, i11);
    }

    @BindingAdapter({"contentPaddingBottom"})
    public static void setContentPaddingBottom(CardView cardView, int i11) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i11);
    }

    @BindingAdapter({"contentPaddingLeft"})
    public static void setContentPaddingLeft(CardView cardView, int i11) {
        cardView.setContentPadding(i11, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @BindingAdapter({"contentPaddingRight"})
    public static void setContentPaddingRight(CardView cardView, int i11) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i11, cardView.getContentPaddingBottom());
    }

    @BindingAdapter({"contentPaddingTop"})
    public static void setContentPaddingTop(CardView cardView, int i11) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), i11, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
