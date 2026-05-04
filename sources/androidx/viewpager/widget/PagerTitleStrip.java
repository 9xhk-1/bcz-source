package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ViewPager.DecorView
/* loaded from: classes3.dex */
public class PagerTitleStrip extends ViewGroup {
    private static final float SIDE_ALPHA = 0.6f;
    private static final int TEXT_SPACING = 16;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference<PagerAdapter> mWatchingAdapter;
    private static final int[] ATTRS = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] TEXT_ATTRS = {R.attr.textAllCaps};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int mScrollState;

        public PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f11 = pagerTitleStrip2.mLastKnownPositionOffset;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f11, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
            this.mScrollState = i11;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float f11, int i12) {
            if (f11 > 0.5f) {
                i11++;
            }
            PagerTitleStrip.this.updateTextPositions(i11, f11, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            if (this.mScrollState == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f11 = pagerTitleStrip2.mLastKnownPositionOffset;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f11, true);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        public SingleLineAllCapsTransform(Context context) {
            this.mLocale = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.mLocale);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.mPageListener);
        viewPager.addOnAdapterChangeListener(this.mPageListener);
        this.mPager = viewPager;
        WeakReference<PagerAdapter> weakReference = this.mWatchingAdapter;
        updateAdapter(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), null);
            this.mPager.setInternalPageChangeListener(null);
            this.mPager.removeOnAdapterChangeListener(this.mPageListener);
            this.mPager = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.mPager != null) {
            float f11 = this.mLastKnownPositionOffset;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            updateTextPositions(this.mLastKnownCurrentPage, f11, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int max;
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i11);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, (int) (size * 0.2f), -2);
        this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
        this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
        this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i12) == 1073741824) {
            max = View.MeasureSpec.getSize(i12);
        } else {
            max = Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i12, this.mCurrText.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mUpdatingText) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i11) {
        this.mGravity = i11;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        int i11 = ((int) (f11 * 255.0f)) & 255;
        this.mNonPrimaryAlpha = i11;
        int i12 = (i11 << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i12);
        this.mNextText.setTextColor(i12);
    }

    public void setTextColor(@ColorInt int i11) {
        this.mTextColor = i11;
        this.mCurrText.setTextColor(i11);
        int i12 = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i12);
        this.mNextText.setTextColor(i12);
    }

    public void setTextSize(int i11, float f11) {
        this.mPrevText.setTextSize(i11, f11);
        this.mCurrText.setTextSize(i11, f11);
        this.mNextText.setTextSize(i11, f11);
    }

    public void setTextSpacing(int i11) {
        this.mScaledTextSpacing = i11;
        requestLayout();
    }

    public void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.mLastKnownCurrentPage = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    public void updateText(int i11, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.mUpdatingText = true;
        CharSequence charSequence = null;
        this.mPrevText.setText((i11 < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i11 - 1));
        this.mCurrText.setText((pagerAdapter == null || i11 >= count) ? null : pagerAdapter.getPageTitle(i11));
        int i12 = i11 + 1;
        if (i12 < count && pagerAdapter != null) {
            charSequence = pagerAdapter.getPageTitle(i12);
        }
        this.mNextText.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mCurrText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mNextText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mLastKnownCurrentPage = i11;
        if (!this.mUpdatingPositions) {
            updateTextPositions(i11, this.mLastKnownPositionOffset, false);
        }
        this.mUpdatingText = false;
    }

    public void updateTextPositions(int i11, float f11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != this.mLastKnownCurrentPage) {
            updateText(i11, this.mPager.getAdapter());
        } else if (!z11 && f11 == this.mLastKnownPositionOffset) {
            return;
        }
        this.mUpdatingPositions = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i16 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = paddingRight + i16;
        int i18 = (width - (paddingLeft + i16)) - i17;
        float f12 = 0.5f + f11;
        if (f12 > 1.0f) {
            f12 -= 1.0f;
        }
        int i19 = ((width - i17) - ((int) (i18 * f12))) - i16;
        int i21 = measuredWidth2 + i19;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i22 = max - baseline;
        int i23 = max - baseline2;
        int i24 = max - baseline3;
        int max2 = Math.max(Math.max(this.mPrevText.getMeasuredHeight() + i22, this.mCurrText.getMeasuredHeight() + i23), this.mNextText.getMeasuredHeight() + i24);
        int i25 = this.mGravity & 112;
        if (i25 == 16) {
            i12 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i25 != 80) {
                i13 = i22 + paddingTop;
                i14 = i23 + paddingTop;
                i15 = paddingTop + i24;
                TextView textView = this.mCurrText;
                textView.layout(i19, i14, i21, textView.getMeasuredHeight() + i14);
                int min = Math.min(paddingLeft, (i19 - this.mScaledTextSpacing) - measuredWidth);
                TextView textView2 = this.mPrevText;
                textView2.layout(min, i13, min + measuredWidth, textView2.getMeasuredHeight() + i13);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.mScaledTextSpacing);
                TextView textView3 = this.mNextText;
                textView3.layout(max3, i15, max3 + measuredWidth3, textView3.getMeasuredHeight() + i15);
                this.mLastKnownPositionOffset = f11;
                this.mUpdatingPositions = false;
            }
            i12 = (height - paddingBottom) - max2;
        }
        i13 = i22 + i12;
        i14 = i23 + i12;
        i15 = i12 + i24;
        TextView textView4 = this.mCurrText;
        textView4.layout(i19, i14, i21, textView4.getMeasuredHeight() + i14);
        int min2 = Math.min(paddingLeft, (i19 - this.mScaledTextSpacing) - measuredWidth);
        TextView textView22 = this.mPrevText;
        textView22.layout(min2, i13, min2 + measuredWidth, textView22.getMeasuredHeight() + i13);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.mScaledTextSpacing);
        TextView textView32 = this.mNextText;
        textView32.layout(max32, i15, max32 + measuredWidth3, textView32.getMeasuredHeight() + i15);
        this.mLastKnownPositionOffset = f11;
        this.mUpdatingPositions = false;
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastKnownCurrentPage = -1;
        this.mLastKnownPositionOffset = -1.0f;
        this.mPageListener = new PageListener();
        TextView textView = new TextView(context);
        this.mPrevText = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.mCurrText = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.mNextText = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        boolean z11 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setTextAppearance(this.mPrevText, resourceId);
            TextViewCompat.setTextAppearance(this.mCurrText, resourceId);
            TextViewCompat.setTextAppearance(this.mNextText, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.mPrevText.setTextColor(color);
            this.mCurrText.setTextColor(color);
            this.mNextText.setTextColor(color);
        }
        this.mGravity = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.mTextColor = this.mCurrText.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.mPrevText;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.mCurrText.setEllipsize(truncateAt);
        this.mNextText.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, TEXT_ATTRS);
            z11 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z11) {
            setSingleLineAllCaps(this.mPrevText);
            setSingleLineAllCaps(this.mCurrText);
            setSingleLineAllCaps(this.mNextText);
        } else {
            this.mPrevText.setSingleLine();
            this.mCurrText.setSingleLine();
            this.mNextText.setSingleLine();
        }
        this.mScaledTextSpacing = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
