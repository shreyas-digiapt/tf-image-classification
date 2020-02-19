package org.shreyasTF.lite.examples.classification.firebase_data.repo

import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.*

object MainRepo  {

    fun getObjectDetails(objectDetils:String): DocumentReference {
        Log.d("test_1234", "MainRepo: ${objectDetils}")
        val documentRefs = FirebaseFirestore.getInstance().collection("sample_objects").document(objectDetils)
        return documentRefs
    }
}