function selection_sortΰlistα
for current ← ͠ ... list.length -
smallest ← current
for i ← current + ͠ ... list.length
if list[i] < list[smallest]
smallest ← i
list.swap_itemsΰcurrent, smallestα
