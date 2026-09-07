# Sagar Hardware V14 — Automatic APK Build

यह project GitHub Actions के जरिए APK build करने के लिए तैयार है।

## सबसे आसान तरीका
1. इस ZIP को extract करें।
2. GitHub पर नया repository बनाएं।
3. सभी files upload/push करें।
4. **Actions** tab में `Build Android APK` workflow चलाएं।
5. Build पूरा होने के बाद workflow के **Artifacts** में `sagar-hardware-debug-apk` डाउनलोड करें।
6. Artifact ZIP के अंदर `app-debug.apk` मिलेगा।

## Local Android Studio
Android Studio + JDK 17 + Android SDK 35 में project खोलकर Build > Build APK(s) करें।

## Security
यह demo app है। Production में Supabase, OTP, payment और admin authentication server-side जोड़ना जरूरी है।
