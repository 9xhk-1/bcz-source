package androidx.compose.ui.autofill;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(message = "\n        You no longer have to call these apis when focus changes. They will be called\n        automatically when you Use the new semantics based APIs for autofill. Use the\n        androidx.compose.ui.autofill.ContentType and androidx.compose.ui.autofill.ContentDataType\n        semantics properties instead.\n        ")
/* loaded from: classes.dex */
public interface Autofill {
    void cancelAutofillForNode(@m80.k AutofillNode autofillNode);

    void requestAutofillForNode(@m80.k AutofillNode autofillNode);
}
