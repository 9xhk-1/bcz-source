package com.baicizhan.client.business.util;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.baicizhan.client.business.util.PicassoUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ThemeResUtil {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShapeDrawableBuilder {
        private float mBLCorner;
        private float mBRCorner;
        private Context mContext;
        private float mStrokeWidth;
        private float mTLCorner;
        private float mTRCorner;
        private int mColor = 0;
        private int mColorAttr = -1;
        private int mStrokeColorAtt = -1;
        private int mStrokeColor = 0;
        private int mCorner = -1;

        public GradientDrawable build() {
            if (!isAlive()) {
                return null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f11 = this.mStrokeWidth;
            if (f11 > 0.0f && this.mStrokeColorAtt >= 0) {
                gradientDrawable.setStroke(xb.i.a(this.mContext, f11), ThemeUtil.getThemeColorWithAttr(this.mContext, this.mStrokeColorAtt));
            }
            float f12 = this.mStrokeWidth;
            if (f12 > 0.0f && this.mStrokeColor != 0) {
                gradientDrawable.setStroke(xb.i.a(this.mContext, f12), this.mStrokeColor);
            }
            int i11 = this.mColorAttr;
            if (i11 > 0) {
                gradientDrawable.setColor(ThemeUtil.getThemeColorWithAttr(this.mContext, i11));
            }
            int i12 = this.mColor;
            if (i12 != 0) {
                gradientDrawable.setColor(i12);
            }
            if (this.mCorner >= 0) {
                gradientDrawable.setCornerRadius(xb.i.a(this.mContext, r3));
            } else {
                gradientDrawable.setCornerRadii(new float[]{xb.i.a(this.mContext, this.mTLCorner), xb.i.a(this.mContext, this.mTLCorner), xb.i.a(this.mContext, this.mTRCorner), xb.i.a(this.mContext, this.mTRCorner), xb.i.a(this.mContext, this.mBRCorner), xb.i.a(this.mContext, this.mBRCorner), xb.i.a(this.mContext, this.mBLCorner), xb.i.a(this.mContext, this.mBLCorner)});
            }
            this.mContext = null;
            return gradientDrawable;
        }

        public boolean isAlive() {
            return this.mContext != null;
        }

        public ShapeDrawableBuilder setBLCorner(int corner) {
            this.mBLCorner = corner;
            return this;
        }

        public ShapeDrawableBuilder setBRCorner(int corner) {
            this.mBRCorner = corner;
            return this;
        }

        public ShapeDrawableBuilder setColor(int color) {
            this.mColor = color;
            return this;
        }

        public ShapeDrawableBuilder setColorAttr(int colorAttr) {
            this.mColorAttr = colorAttr;
            return this;
        }

        public ShapeDrawableBuilder setCorner(int corner) {
            this.mCorner = corner;
            return this;
        }

        public ShapeDrawableBuilder setCorners(float cornerRadius, PicassoUtil.Corners corners) {
            int code = corners.getCode();
            PicassoUtil.Corners corners2 = PicassoUtil.Corners.BOTTOM;
            boolean z11 = true;
            boolean z12 = code == corners2.getCode() || code == PicassoUtil.Corners.BOTTOM_LEFT.getCode();
            boolean z13 = code == corners2.getCode() || code == PicassoUtil.Corners.BOTTOM_RIGHT.getCode();
            PicassoUtil.Corners corners3 = PicassoUtil.Corners.TOP;
            boolean z14 = code == corners3.getCode() || code == PicassoUtil.Corners.TOP_LEFT.getCode();
            if (code != corners3.getCode() && code != PicassoUtil.Corners.TOP_RIGHT.getCode()) {
                z11 = false;
            }
            this.mTLCorner = z14 ? cornerRadius : 0.0f;
            this.mTRCorner = z11 ? cornerRadius : 0.0f;
            this.mBLCorner = z12 ? cornerRadius : 0.0f;
            if (!z13) {
                cornerRadius = 0.0f;
            }
            this.mBRCorner = cornerRadius;
            return this;
        }

        public ShapeDrawableBuilder setStroke(float width, int colorAttr) {
            this.mStrokeWidth = width;
            this.mStrokeColorAtt = colorAttr;
            return this;
        }

        public ShapeDrawableBuilder setStrokeColor(float width, int color) {
            this.mStrokeWidth = width;
            this.mStrokeColor = color;
            return this;
        }

        public ShapeDrawableBuilder setTLCorner(int corner) {
            this.mTLCorner = corner;
            return this;
        }

        public ShapeDrawableBuilder setTRCorner(int corner) {
            this.mTRCorner = corner;
            return this;
        }

        public ShapeDrawableBuilder with(Context context) {
            this.mContext = context;
            return this;
        }
    }

    private ThemeResUtil() {
    }

    public static Drawable getCheckStateDrawable(Context context, Drawable defDrawable, Drawable checkedDrawable) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked, R.attr.state_enabled}, checkedDrawable);
        stateListDrawable.addState(new int[0], defDrawable);
        return stateListDrawable;
    }

    public static GradientDrawable getCorneredRectShape(int color, float cornerInPx) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(cornerInPx);
        return gradientDrawable;
    }

    public static Drawable getScrollerHandleBg(Context context) {
        return new ShapeDrawableBuilder().with(context).setColorAttr(com.jiongji.andriod.card.R.attr.color_button_oval).setCorner(5).build();
    }

    public static Drawable getSelectStateDrawable(Context context, int defColor, int selectedColor) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(ThemeUtil.getThemeColorWithAttr(context, defColor));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(ThemeUtil.getThemeColorWithAttr(context, selectedColor));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected, R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public static void setBacizhanProgress2(Context context, ProgressBar pb2) {
        setBaicizhanProgress(context, pb2, 90, context.getResources().getColor(com.jiongji.andriod.card.R.color.main_gray), context.getResources().getColor(com.jiongji.andriod.card.R.color.main_blue));
    }

    public static void setBackgroundColorShape(Context context, View view, int defColor, int pressColor, float cornerInDp) {
        GradientDrawable corneredRectShape = getCorneredRectShape(defColor, xb.i.a(context, cornerInDp));
        GradientDrawable corneredRectShape2 = getCorneredRectShape(Color.argb(180, Color.red(defColor), Color.green(defColor), Color.blue(defColor)), xb.i.a(context, cornerInDp));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, getCorneredRectShape(pressColor, xb.i.a(context, cornerInDp)));
        stateListDrawable.addState(new int[]{-16842910}, corneredRectShape2);
        stateListDrawable.addState(new int[0], corneredRectShape);
        lq.c.b(view, stateListDrawable);
    }

    public static void setBackgroundShape(Context context, View view, int defColorAttr, int pressColorAttr, float cornerInDp) {
        GradientDrawable corneredRectShape = getCorneredRectShape(ThemeUtil.getThemeColorWithAttr(context, defColorAttr), xb.i.a(context, cornerInDp));
        if (pressColorAttr <= 0) {
            lq.c.b(view, corneredRectShape);
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, getCorneredRectShape(ThemeUtil.getThemeColorWithAttr(context, pressColorAttr), xb.i.a(context, cornerInDp)));
        stateListDrawable.addState(new int[0], corneredRectShape);
        lq.c.b(view, stateListDrawable);
    }

    public static void setBackgroundShapeWithColor(Context context, View view, int defColor, int pressColor, float cornerInDp, PicassoUtil.Corners corners) {
        GradientDrawable build = new ShapeDrawableBuilder().with(context).setColor(defColor).setCorners(cornerInDp, corners).build();
        if (pressColor == defColor) {
            lq.c.b(view, build);
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, new ShapeDrawableBuilder().with(context).setColor(pressColor).setCorners(cornerInDp, corners).build());
        stateListDrawable.addState(new int[0], build);
        lq.c.b(view, stateListDrawable);
    }

    public static void setBaicizhanProgress(Context context, ProgressBar pb2, int corner, int bgColor, int pgColor) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ShapeDrawableBuilder().with(context).setColor(bgColor).setCorner(corner).build(), new ClipDrawable(new ShapeDrawableBuilder().with(context).setColor(pgColor).setCorner(corner).build(), 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        pb2.setProgressDrawable(layerDrawable);
    }

    public static void setCardBg(Context context, View view) {
        lq.c.b(view, new ShapeDrawableBuilder().with(context).setColorAttr(com.jiongji.andriod.card.R.attr.color_card_bg).setCorner(4).build());
    }

    public static void setCommonBg(Context context, View view) {
        lq.c.b(view, new ShapeDrawableBuilder().with(context).setColorAttr(com.jiongji.andriod.card.R.attr.color_common_bg).setCorner(4).build());
    }

    public static void setCommonBgWideRound(Context context, View view) {
        lq.c.b(view, new ShapeDrawableBuilder().with(context).setColorAttr(com.jiongji.andriod.card.R.attr.color_common_bg).setCorner(10).build());
    }

    public static void setFmTvGoBtnShape(Context context, View view) {
        setBackgroundShape(context, view, com.jiongji.andriod.card.R.attr.color_button_tvfm, com.jiongji.andriod.card.R.attr.color_text_blue, 4.0f);
    }

    public static void setMessageShareBg(Context context, View view) {
        lq.c.b(view, new ShapeDrawableBuilder().with(context).setColorAttr(com.jiongji.andriod.card.R.attr.color_message_sharebg).setCorner(4).build());
    }

    public static void setProgress(Context context, View view) {
        lq.c.b(view, new ShapeDrawableBuilder().with(context).setColorAttr(com.jiongji.andriod.card.R.attr.color_progress).setTLCorner(4).setTRCorner(4).build());
    }

    public static void setShape(Context context, View view, int color, int corner) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(xb.i.a(context, corner));
        lq.c.b(view, gradientDrawable);
    }

    public static void setSoundBg(Context context, View view) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(false);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sound_3), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sound_1), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sound_2), 150);
        lq.c.b(view, animationDrawable);
    }

    public static void setSoundImageSrc_v2(Context context, ImageView view) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(false);
        animationDrawable.addFrame(ThemeUtil.getThemeDrawableWithAttr(context, com.jiongji.andriod.card.R.attr.drawable_walk_sound4), 150);
        animationDrawable.addFrame(ThemeUtil.getThemeDrawableWithAttr(context, com.jiongji.andriod.card.R.attr.drawable_walk_sound1), 150);
        animationDrawable.addFrame(ThemeUtil.getThemeDrawableWithAttr(context, com.jiongji.andriod.card.R.attr.drawable_walk_sound2), 150);
        animationDrawable.addFrame(ThemeUtil.getThemeDrawableWithAttr(context, com.jiongji.andriod.card.R.attr.drawable_walk_sound3), 150);
        animationDrawable.addFrame(ThemeUtil.getThemeDrawableWithAttr(context, com.jiongji.andriod.card.R.attr.drawable_walk_sound4), 150);
        view.setImageDrawable(animationDrawable);
    }

    public static void setSpeakSeBg(Context context, View view) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(false);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sentence_sounds_3), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sentence_sounds_1), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sentence_sounds_2), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sentence_sounds_3), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_sentence_sounds_1), 150);
        lq.c.b(view, animationDrawable);
    }

    public static void setSpeakWordBg(Context context, View view) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(false);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_words_sounds_3), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_words_sounds_1), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_words_sounds_2), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_words_sounds_3), 150);
        animationDrawable.addFrame(context.getResources().getDrawable(com.jiongji.andriod.card.R.drawable.ic_study_words_sounds_1), 150);
        lq.c.b(view, animationDrawable);
    }

    public static void setSubmitBtnShape(Context context, View view) {
        setBackgroundShape(context, view, com.jiongji.andriod.card.R.attr.color_progress, com.jiongji.andriod.card.R.attr.color_button_mail_login, 4.0f);
    }

    public static void setVoiceBg(Context context, View view) {
        lq.c.b(view, new ShapeDrawableBuilder().with(context).setColor(context.getResources().getColor(com.jiongji.andriod.card.R.color.main_color_weak_divider)).setCorner(4).build());
    }

    public static void setWindowOutline(Context context, View view) {
        lq.c.b(view, new ShapeDrawableBuilder().with(context).setStroke(2.0f, com.jiongji.andriod.card.R.attr.color_window_outline).setCorner(6).build());
    }

    public static void setWordListNavBg(Context context, View view) {
        lq.c.b(view, getSelectStateDrawable(context, -1, com.jiongji.andriod.card.R.attr.color_window_outline));
    }

    public static Drawable getSelectStateDrawable(Context context, Drawable defDrawable, int selectedColor) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(ThemeUtil.getThemeColorWithAttr(context, selectedColor));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected, R.attr.state_enabled}, gradientDrawable);
        stateListDrawable.addState(new int[0], defDrawable);
        return stateListDrawable;
    }

    public static void setBackgroundShape(Context context, View view, int defColorAttr, int pressColorAttr, float cornerInDp, PicassoUtil.Corners corners) {
        GradientDrawable build = new ShapeDrawableBuilder().with(context).setColorAttr(defColorAttr).setCorners(cornerInDp, corners).build();
        if (pressColorAttr > 0) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, new ShapeDrawableBuilder().with(context).setColorAttr(pressColorAttr).setCorners(cornerInDp, corners).build());
            stateListDrawable.addState(new int[0], build);
            lq.c.b(view, stateListDrawable);
            return;
        }
        lq.c.b(view, build);
    }

    public static void setBackgroundShape(Context context, View view, int defColorAttr, float cornerInDp, PicassoUtil.Corners corners) {
        setBackgroundShape(context, view, defColorAttr, -1, cornerInDp, corners);
    }

    public static void setBackgroundShape(Context context, View view, int defColorAttr, float cornerInDp) {
        setBackgroundShape(context, view, defColorAttr, -1, cornerInDp);
    }

    public static void setBackgroundShape(Context context, View view, int defColor, int pressColor, int strokeWidth, int strokeColor, float cornerInDp) {
        GradientDrawable corneredRectShape = getCorneredRectShape(defColor, xb.i.a(context, cornerInDp));
        if (strokeWidth > 0) {
            corneredRectShape.setStroke(xb.i.a(context, strokeWidth), strokeColor);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable corneredRectShape2 = getCorneredRectShape(pressColor, xb.i.a(context, cornerInDp));
        if (strokeWidth > 0) {
            corneredRectShape2.setStroke(xb.i.a(context, strokeWidth), strokeColor);
        }
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, corneredRectShape2);
        stateListDrawable.addState(new int[0], corneredRectShape);
        lq.c.b(view, stateListDrawable);
    }

    public static void setCheckPlayButton(Context context, CheckBox cb2) {
    }
}
