
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affiramation


class Datasource {

    fun loadAffirmations(): List<Affiramation> {
        return listOf<Affiramation>(
                Affiramation(R.string.affirmation1, R.drawable.image1),
                Affiramation(R.string.affirmation2, R.drawable.image2),
                Affiramation(R.string.affirmation3, R.drawable.image3),
                Affiramation(R.string.affirmation4, R.drawable.image4),
                Affiramation(R.string.affirmation5, R.drawable.image5),
                Affiramation(R.string.affirmation6, R.drawable.image6),
                Affiramation(R.string.affirmation7, R.drawable.image7),
                Affiramation(R.string.affirmation8, R.drawable.image8),
                Affiramation(R.string.affirmation9, R.drawable.image9),
                Affiramation(R.string.affirmation10, R.drawable.image10)

        )

    }
}

