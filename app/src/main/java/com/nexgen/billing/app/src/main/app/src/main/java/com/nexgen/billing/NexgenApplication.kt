package com.nexgen.billing

import android.app.Application
import com.nexgen.billing.data.database.AppDatabase
import com.nexgen.billing.data.repository.BillingRepository
import com.nexgen.billing.licensing.LicenseManager
import com.nexgen.billing.preferences.CafeSettingsManager
import com.nexgen.billing.security.StaffAccessManager

class NexgenApplication : Application() {
    
    val database by lazy { AppDatabase.getDatabase(this) }
    val billingRepository by lazy { BillingRepository(database.billingDao()) }
    
    val settingsManager by lazy { CafeSettingsManager(this) }
    val licenseManager by lazy { LicenseManager(this) }
    val accessManager by lazy { StaffAccessManager(this) }

    override fun onCreate() {
        super.onCreate()
    }
}
