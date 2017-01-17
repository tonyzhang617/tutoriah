package com.hackference.team20.tutoriah.others;

import android.graphics.drawable.Icon;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.hackference.team20.tutoriah.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tianyi Zhang on 11/26/2016.
 */
public class TutorAdapter extends RecyclerView.Adapter<TutorAdapter.TutorHolder> {

    private List<Tutor> tutorList;

    public TutorAdapter() {
        tutorList = new ArrayList<>();
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
        tutorList.add(new Tutor(R.mipmap.pp_oleary, "Kevin O\'Leary", "Business", 5.0f));
        tutorList.add(new Tutor(R.mipmap.pp_newton, "Isaac Newton", "Physics, Calculus", 4.8f));
        tutorList.add(new Tutor(R.mipmap.pp_einstein, "Albert Einstein", "Physics, Relativity", 4.9f));
        tutorList.add(new Tutor(R.mipmap.pp_musk, "Elon Musk", "Math, Physics", 4.6f));
        tutorList.add(new Tutor(R.mipmap.pp_trump, "Donald Trump", "Politics", 1.0f));
    }

    @Override
    public TutorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_tutor, parent, false);

        return new TutorHolder(itemView);    }

    @Override
    public void onBindViewHolder(TutorHolder holder, int position) {
        Tutor tutor = tutorList.get(position);
        if (tutor.getIdImage() != 0) {
            holder.imageProfPic.setImageResource(tutor.getIdImage());
        }
        holder.textName.setText(tutor.getName());
        holder.textSubjects.setText(tutor.getSubjects());
        holder.ratingBar.setRating(tutor.getRating());
    }

    @Override
    public int getItemCount() {
        return tutorList.size();
    }

    public class TutorHolder extends RecyclerView.ViewHolder {

        public ImageView imageProfPic;
        public TextView textName, textSubjects;
        public RatingBar ratingBar;

        public TutorHolder(View itemView) {
            super(itemView);
            imageProfPic = (ImageView) itemView.findViewById(R.id.image_prof_pic);
            textName = (TextView) itemView.findViewById(R.id.text_name);
            textSubjects = (TextView) itemView.findViewById(R.id.text_subjects);
            ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
        }
    }

}
