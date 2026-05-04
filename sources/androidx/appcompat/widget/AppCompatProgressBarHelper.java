package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.WrappedDrawable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class AppCompatProgressBarHelper {
    private static final int[] TINT_ATTRS = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    private Bitmap mSampleTile;
    private final ProgressBar mView;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void transferLayerProperties(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i11) {
            layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
            layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
            layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
            layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
            layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
            layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
            layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
            layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
            layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
        }
    }

    public AppCompatProgressBarHelper(ProgressBar progressBar) {
        this.mView = progressBar;
    }

    private Shape getDrawableShape() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable tileifyIndeterminate(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i11 = 0; i11 < numberOfFrames; i11++) {
            Drawable tileify = tileify(animationDrawable.getFrame(i11), true);
            tileify.setLevel(10000);
            animationDrawable2.addFrame(tileify, animationDrawable.getDuration(i11));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    public Bitmap getSampleTile() {
        return this.mSampleTile;
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i11) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, TINT_ATTRS, i11, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.mView.setIndeterminateDrawable(tileifyIndeterminate(drawableIfKnown));
        }
        Drawable drawableIfKnown2 = obtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            this.mView.setProgressDrawable(tileify(drawableIfKnown2, false));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public Drawable tileify(Drawable drawable, boolean z11) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(tileify(wrappedDrawable2, z11));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    int id2 = layerDrawable.getId(i11);
                    drawableArr[i11] = tileify(layerDrawable.getDrawable(i11), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i12 = 0; i12 < numberOfLayers; i12++) {
                    layerDrawable2.setId(i12, layerDrawable.getId(i12));
                    Api23Impl.transferLayerProperties(layerDrawable, layerDrawable2, i12);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.mSampleTile == null) {
                    this.mSampleTile = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(getDrawableShape());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z11 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
