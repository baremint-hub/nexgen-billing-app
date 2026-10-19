# Room Database Rules
-keep class * extends androidx.room.RoomDatabase
-dontwarn androidx.room.paging.**
-keep @androidx.room.Entity class * { *; }

# Keep Data Models
-keep class com.nexgen.billing.domain.model.** { *; }
-keep class com.nexgen.billing.data.database.entity.** { *; }

# Keep Bluetooth Helper safe from aggressive shrinking
-keep class com.nexgen.billing.printer.EscPosHelper { *; }
