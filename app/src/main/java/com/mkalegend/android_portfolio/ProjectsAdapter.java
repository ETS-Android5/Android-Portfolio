package com.mkalegend.android_portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectsViewHolder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectsViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsViewHolder holder, int position) {
        holder.Bind(projects[position]);
    }

    static class ProjectsViewHolder extends RecyclerView.ViewHolder {

        private TextView pName;
        private TextView pDescription;
        private TextView pLink;
        private ImageView pImage;

        public ProjectsViewHolder(@NonNull View itemView) {
            super(itemView);

            pName = itemView.findViewById(R.id.textViewName);
            pDescription = itemView.findViewById(R.id.textViewDescriptions);
            pImage = itemView.findViewById(R.id.imageViewItems);
            pLink = itemView.findViewById(R.id.textViewLink);
        }

        public void Bind(Project project) {
            pName.setText(project.pName);
            pDescription.setText(project.pDescription);
            pImage.setImageResource(project.pImages);
            pLink.setText(String.format("Link: %s", project.pLink));

        }
    }


}
