particle minecraft:flame ~ ~ ~ 0 0 0 0.1 20 force
particle minecraft:lava ~ ~ ~ 0 0 0 0.1 10 force
particle minecraft:smoke ~ ~ ~ 0.5 0.5 0.5 0.1 20 force
summon area_effect_cloud ~ ~ ~ {Particle:"block air",Radius:2f,Duration:10,Effects:[{Id:7,Amplifier:0b,Duration:4,ShowParticles:0b}],CustomName:'{"text":"Fire Breath"}'}