package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;


public class BaseListDiffCallback<S extends ListDiffInterface<S>> extends ItemCallback<S> implements ListDiffInterface<S> {

    @Override
    public boolean areItemsTheSame(@NonNull S oldItem, @NonNull S newItem) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(@NonNull S oldItem, @NonNull S newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull S oldItem, @NonNull S newItem) {
        return newItem;
    }

    @Override
    public boolean theSameAs(S s) {
        return this.hashCode() == s.hashCode();
    }

}
