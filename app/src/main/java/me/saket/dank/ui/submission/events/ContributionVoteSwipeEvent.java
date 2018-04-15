package me.saket.dank.ui.submission.events;

import com.google.auto.value.AutoValue;

import net.dean.jraw.models.PublicContribution;
import net.dean.jraw.models.VoteDirection;

import me.saket.dank.data.SwipeEvent;

@AutoValue
public abstract class ContributionVoteSwipeEvent implements SwipeEvent {

  public abstract PublicContribution contribution();

  public abstract VoteDirection newVoteDirection();

  public static ContributionVoteSwipeEvent create(PublicContribution contribution, VoteDirection newVoteDirection) {
    return new AutoValue_ContributionVoteSwipeEvent(contribution, newVoteDirection);
  }
}
