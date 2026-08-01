# Store Market Template

A modern Android shopping application built with Jetpack Compose, following clean architecture with a unidirectional data flow pattern. This template demonstrates a complete e-commerce UI implementation with offline-first approach using Room database.

## 🌟 Features

- **Jetpack Compose** - Modern UI toolkit for building native Android UIs
- **Offline-First** - Room database for local data persistence
- **Material 3** - Latest Material Design components and theming
- **Navigation** - Type-safe navigation with Compose Navigation
- **State Management** - Unidirectional data flow with StateFlow
- **Coroutines & Flow** - Asynchronous programming made easy
- **Clean Architecture** - Separation of concerns with MVVM pattern
- **Bottom Navigation** - Intuitive navigation with custom bottom nav bar

## 🏗️ Architecture

The application follows a clean architecture approach with the structure shown below:

```
ir.yaghotcod.test2/
├── ui/
│   ├── theme/
│   │   ├── Color.kt          # Color system and palettes
│   │   ├── Theme.kt          # App theme configuration
│   │   └── Type.kt           # Typography system
│   ├── bottomNavigation.kt    # Bottom navigation implementation
│   ├── BottomNavItem.kt       # Navigation items definition
│   ├── CartPage.kt            # Shopping cart screen
│   ├── digi.kt               # Main app composables
│   ├── HomePage.kt            # Home screen with products
│   ├── LoginPage.kt           # Authentication screen
│   └── MainActivity.kt        # Main entry point
```

### Layer Structure

#### UI Layer (Presentation)
- **Activities**: MainActivity as the host for navigation
- **Composables**: Screens and reusable UI components
- **ViewModels**: State holders and business logic
- **State**: UI state management with StateFlow

#### Data Layer
- **Local Database**: Room for persistent storage
- **Repositories**: Data access and business logic
- **Models**: Data classes for products, cart items, etc.

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Toolkit**: Jetpack Compose + Material 3
- **Architecture**: MVVM + Clean Architecture
- **Navigation**: Navigation Compose
- **Database**: Room
- **Image Loading**: Coil (or Glide Compose)
- **Asynchronous**: Kotlin Coroutines + Flow
- **State Management**: StateFlow / MutableStateFlow
- **Dependency Injection**: Hilt (optional)

## 📱 Screens

- **Login Page** - User authentication and sign-in
- **Home Page** - Product browsing with categories
- **Cart Page** - Shopping cart management
- **Bottom Navigation** - Seamless screen switching
- **Profile** - User profile (optional)

## 🚀 Getting Started

### Prerequisites
- Android Studio Flamingo or later
- Java 11 or higher
- Android SDK API 24 or higher

### Installation

1. Clone the repository
```bash
git clone https://github.com/yourusername/store-market-template.git
```

2. Open the project in Android Studio

3. Let the build complete (download dependencies)

4. Run the application on an emulator or physical device

### Configuration

No external API configuration needed - this project uses local Room database for data persistence.

## 📁 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/ir/yaghotcod/test2/
│   │   │   ├── ui/
│   │   │   │   ├── theme/
│   │   │   │   │   ├── Color.kt
│   │   │   │   │   ├── Theme.kt
│   │   │   │   │   └── Type.kt
│   │   │   │   ├── bottomNavigation.kt
│   │   │   │   ├── BottomNavItem.kt
│   │   │   │   ├── CartPage.kt
│   │   │   │   ├── digi.kt
│   │   │   │   ├── HomePage.kt
│   │   │   │   ├── LoginPage.kt
│   │   │   │   └── MainActivity.kt
│   │   │   ├── data/
│   │   │   │   ├── local/
│   │   │   │   └── repository/
│   │   │   └── viewmodel/
│   │   └── res/
│   └── test/
└── build.gradle
```

## 🎨 UI Customization

The theming system is centralized in the `theme` package:

- **Color.kt**: Defines color palettes and semantic colors
- **Theme.kt**: Configures Material 3 theme with dark/light modes
- **Type.kt**: Typography scales and font configurations

## 🧪 Testing

The project supports comprehensive testing:
- **Unit Tests** - JUnit4 + MockK
- **UI Tests** - Compose UI Testing
- **Integration Tests** - TestCoroutineDispatcher

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- [@stevenfaster-oss](https://github.com/stevenfaster-oss)

## 🙏 Acknowledgments

- Jetpack Compose Documentation
- Google Android Developers
- Material Design 3 Guidelines

---

# قالب فروشگاه (Store Market Template)

یک برنامه اندروید مدرن ساخته شده با Jetpack Compose، با معماری تمیز و الگوی جریان داده یک‌جهته. این قالب یک پیاده‌سازی کامل از رابط کاربری فروشگاهی با رویکرد آفلاین-اول و استفاده از پایگاه داده Room را نمایش می‌دهد.

## 🌟 ویژگی‌ها

- **Jetpack Compose** - ابزار مدرن ساخت UI برای اندروید
- **آفلاین-اول** - پایگاه داده Room برای ذخیره‌سازی محلی
- **Material 3** - جدیدترین کامپوننت‌های طراحی متریال
- **ناوبری** - ناوبری نوع‌مندی با Compose Navigation
- **مدیریت وضعیت** - جریان داده یک‌جهته با StateFlow
- **Coroutines و Flow** - برنامه‌نویسی ناهمگام آسان
- **معماری تمیز** - تفکیک وظایف با الگوی MVVM
- **ناوبری پایین** - ناوبری شهودی با نوار ناوبری سفارشی

## 🏗️ معماری

این برنامه از معماری تمیز با ساختار زیر پیروی می‌کند:

```
ir.yaghotcod.test2/
├── ui/
│   ├── theme/
│   │   ├── Color.kt          # سیستم رنگ و پالت‌ها
│   │   ├── Theme.kt          # پیکربندی تم برنامه
│   │   └── Type.kt           # سیستم تایپوگرافی
│   ├── bottomNavigation.kt    # پیاده‌سازی ناوبری پایین
│   ├── BottomNavItem.kt       # تعریف آیتم‌های ناوبری
│   ├── CartPage.kt            # صفحه سبد خرید
│   ├── digi.kt               # کامپوزهای اصلی برنامه
│   ├── HomePage.kt            # صفحه خانه با محصولات
│   ├── LoginPage.kt           # صفحه احراز هویت
│   └── MainActivity.kt        # نقطه ورود اصلی
```

### ساختار لایه‌ها

#### لایه UI (نمایش)
- **Activity**: MainActivity به عنوان میزبان ناوبری
- **کامپوزها**: صفحه‌ها و کامپوننت‌های قابل استفاده مجدد UI
- **ViewModel**: نگهدارنده وضعیت و منطق کسب‌وکار
- **وضعیت**: مدیریت وضعیت UI با StateFlow

#### لایه داده
- **پایگاه داده محلی**: Room برای ذخیره‌سازی پایدار
- **مخزن‌ها**: دسترسی به داده و منطق کسب‌وکار
- **مدل‌ها**: کلاس‌های داده برای محصولات، آیتم‌های سبد خرید و غیره

## 🛠️ تکنولوژی‌ها

- **زبان**: کاتلین
- **UI**: Jetpack Compose + Material 3
- **معماری**: MVVM + معماری تمیز
- **ناوبری**: Navigation Compose
- **پایگاه داده**: Room
- **بارگذاری تصاویر**: Coil (یا Glide Compose)
- **ناهمگام**: Kotlin Coroutines + Flow
- **مدیریت وضعیت**: StateFlow / MutableStateFlow
- **تزریق وابستگی**: Hilt (اختیاری)

## 📱 صفحات

- **صفحه ورود** - احراز هویت کاربر
- **صفحه خانه** - مرور محصولات با دسته‌بندی
- **صفحه سبد خرید** - مدیریت سبد خرید
- **ناوبری پایین** - تغییر صفحه‌های روان
- **پروفایل** - پروفایل کاربر (اختیاری)

## 🚀 شروع سریع

### پیش‌نیازها
- Android Studio Flamingo یا جدیدتر
- Java 11 یا بالاتر
- Android SDK API 24 یا بالاتر

### نصب و راه‌اندازی

1. کلون کردن مخزن
```bash
git clone https://github.com/yourusername/store-market-template.git
```

2. باز کردن پروژه در Android Studio

3. اجازه دهید build کامل شود (دانلود وابستگی‌ها)

4. اجرای برنامه روی شبیه‌ساز یا دستگاه فیزیکی

### پیکربندی

نیازی به پیکربندی API خارجی نیست - این پروژه از پایگاه داده محلی Room برای ذخیره‌سازی داده‌ها استفاده می‌کند.

## 📁 ساختار پروژه

```
app/
├── src/
│   ├── main/
│   │   ├── java/ir/yaghotcod/test2/
│   │   │   ├── ui/
│   │   │   │   ├── theme/
│   │   │   │   │   ├── Color.kt
│   │   │   │   │   ├── Theme.kt
│   │   │   │   │   └── Type.kt
│   │   │   │   ├── bottomNavigation.kt
│   │   │   │   ├── BottomNavItem.kt
│   │   │   │   ├── CartPage.kt
│   │   │   │   ├── digi.kt
│   │   │   │   ├── HomePage.kt
│   │   │   │   ├── LoginPage.kt
│   │   │   │   └── MainActivity.kt
│   │   │   ├── data/
│   │   │   │   ├── local/
│   │   │   │   └── repository/
│   │   │   └── viewmodel/
│   │   └── res/
│   └── test/
└── build.gradle
```

## 🎨 سفارشی‌سازی UI

سیستم تم‌سازی در پکیج `theme` متمرکز شده است:

- **Color.kt**: تعریف پالت‌های رنگی و رنگ‌های معنایی
- **Theme.kt**: پیکربندی تم Material 3 با حالت‌های تاریک/روشن
- **Type.kt**: مقیاس‌های تایپوگرافی و پیکربندی فونت‌ها

## 🧪 تست

پروژه از تست‌های جامع پشتیبانی می‌کند:
- **تست‌های واحد** - JUnit4 + MockK
- **تست‌های UI** - Compose UI Testing
- **تست‌های یکپارچه** - TestCoroutineDispatcher

## 🤝 مشارکت

مشارکت‌ها خوش‌آمد هستند! لطفاً مراحل زیر را دنبال کنید:

1. فورک کردن مخزن
2. ایجاد یک شاخه برای ویژگی جدید (`git checkout -b feature/AmazingFeature`)
3. ثبت تغییرات (`git commit -m 'Add some AmazingFeature'`)
4. پوشش به شاخه (`git push origin feature/AmazingFeature`)
5. باز کردن درخواست Pull Request

## 📄 مجوز

این پروژه تحت مجوز MIT منتشر شده است - برای جزئیات به فایل [LICENSE](LICENSE) مراجعه کنید.

## 👥 نویسندگان
- [@stevenfaster-oss](https://github.com/stevenfaster-oss)

## 🙏 قدردانی

- مستندات Jetpack Compose
- توسعه‌دهندگان اندروید گوگل
- راهنمای Material Design 3
