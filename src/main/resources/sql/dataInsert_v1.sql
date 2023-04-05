DROP SCHEMA IF EXISTS DontTrumps;

CREATE SCHEMA DontTrumps;
USE DontTrumps;

CREATE TABLE DontTrumps.rarities(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(32) NOT NULL
);

INSERT INTO DontTrumps.rarities(`name`)
VALUES ('normal'), ('rare'), ('very rare');

CREATE TABLE DontTrumps.cards(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(32) NOT NULL,
description VARCHAR(150) NOT NULL,
strength INTEGER NOT NULL,
intelligence INTEGER NOT NULL,
defense INTEGER NOT NULL,
rarity_id INTEGER NOT NULL,
is_trunfo VARCHAR(100) NOT NULL,
image VARCHAR(100),
FOREIGN KEY (rarity_id) REFERENCES rarities(id)
);

INSERT INTO DontTrumps.cards(`name`, `description`, `strength`, `intelligence`, `defense`, `rarity_id`, `is_trunfo`)
VALUES
('Walter', 'Walter is an odd but cheerful boy, whose ability to assess danger leaves something to be desired.', 41, 31, 29, 1, 0),
('Wanda', 'Wanda is a skilled clockmaker who will stop at nothing to outrun her future.', 28, 72, 31, 1, 0),
('Warly', 'To Warly, cooking is a language through which to express love and gratitude to those he holds dear.', 34, 43, 58, 1, 0),
('Wigfrid', 'Whoever Wigfrid was before her titular role has been lost to time, and the power of method acting.', 64, 22, 61, 1, 0),
('Maxwell', 'Formerly the Shadow King, lately Maxwell finds himself reacquainted with life among the commonfolk.', 42, 74, 21, 1, 0),
('Webber', 'Webber is a polite young monster who cares deeply for all his friends, human or otherwise.',44, 24, 41, 1, 0),
('Wendy', 'Wendy is a morose young lady with a sisterly bond so powerful, it transcends death itself.', 31, 38, 39, 1, 0),
('Wes', 'Wes is a mime of many thoughts, but few words.', 25, 36, 24, 1, 0),
('Wickerbottom', 'A woman of curious mind and stern air, Wickerbottom thrives on the lifelong pursuit of knowledge.', 28, 64, 29, 1, 0),
('Willow', 'Willow is a candid woman whose penchant for fire often gets her into more than a little trouble.', 43, 31, 39, 1, 0),
('Wilson', 'At heart Wilson is truly a man of science. It\'s not in his nature to resist the call of the unknown', 37, 69, 38, 1, 0),
('Winona', 'Winona is a former assembly line worker with a boisterous attitude and a love of all things mechanical.', 58, 31, 42, 1, 0),
('Wolfgang', 'Wolfgang is an affable, musclebound giant with a heart plagued by a myriad of phobias.', 67, 29, 64, 1, 0),
('Woodie', 'A gruff, bearded woodsman, Woodie has a soft spot for nature, plaid, and his trusty axe, Lucy.', 46, 21, 39, 1, 0),
('Wormwood', 'An amalgam of vines given sentience by lunar magic, Wormwood searches for friends so he can finally belong.', 32, 31, 67, 1, 0),
('Wortox', 'Wortox is a mischievous imp whose levity masks a deep well of guilt. He has taken many souls in his time.', 61, 43, 54, 1, 0),
('Wurt', 'Wurt is a curious young Merm trying to expand her horizons... as long as those horizons dont extend into Pig territory.', 37, 31, 41, 1, 0),
('WX-78', 'One might assume WX\'s callous nature hides a sensitive inner soul. One would assume incorrectly.', 41, 34, 78, 1, 0),
('Antlion', 'The mighty lion.', 35, 19, 48, 1, 0),
('Bearger', 'Eats food, be it in containers or on the ground.', 44, 21, 36, 1, 0),
('Bee Queen', 'Spawns and boosts Grumble Bees. Leaves a slowing trail of honey.', 29, 16, 59, 1, 0),
('Deerclops', 'Destroys structures and trees. Freezes enemies', 41, 23, 38, 1, 0),
('Dragonfly', 'Spits lava. Engulfs herself in fire when attacked, sets anything near strength on fire and deals constant fire damage to anything nearb.', 1, 46, 12, 1, 0),
('Eye of Terror', 'Don\'t look at me.', 31, 29, 46, 1, 0),
('Moose', 'Honks to make the player drop their weapon.', 34, 18, 47, 1, 0),
('The Boy Detective Walter', 'Don\'t worry Sirs and Madams, Woby and I are on the case!', 36, 51, 31, 2, 0),
('The Tinkersmith Wanda', 'Not enough people appreciate the minutiae of temporal tinkering.', 34, 90, 29, 3, 0),
('The Head Chef Warly', 'It\'s a fine day for some fine dining, non?', 31, 51, 54, 3, 0),
('The Gladiator Wigfrid', 'My skill in battle is withöut peer.', 79, 22, 66, 2, 0),
('Guest of Honor Maxwell', 'To be trully remembered.', 41, 70, 26, 2, 0),
('The Nostalgic Wendy', 'Abigail and I shared everything.', 64, 41, 46, 2, 0),
('The Bewitched Wickerbottom', 'The forbidden knowledge is still knowledge.', 33, 86, 29, 2, 0),
('The Forlorn Doll Willow', 'Why did you leave me?', 61, 26, 47, 3, 0),
('The Woeful Willow', 'Don\'t you dare touch Bernie.', 69, 32, 34, 2, 0),
('Wilson The Mad Scientist', 'Stand back. I\'m going to do SCIENCE!', 38, 81, 31, 3, 0),
('Wolfgang The MacTusk', 'Wolfgang is large moustache man! Ha ha!', 82, 27, 72, 2, 0),
('The Tree Hugger Woodie', 'The nature shall be protected!', 29, 51, 62, 2, 0),
('The Abyssal Wurt', 'It called bye-oh-loomy...loominess...loominessence... GLOWY!', 67, 22, 51, 3, 0),
('The Little Sinker Wurt', 'Going to! Drown you!', 51, 61, 49, 2, 0),
('The Snowfallen Wortox', 'You better hold on well to your soul on this cold night.', 74, 32, 61, 2, 0),
('The Snowfallen WX-78', 'FREEZING... SYSTEMS...', 51, 28, 90, 2, 0),
('The Triumphant Wendy', 'I\'m going to do it... In behalf of my sister.', 63, 52, 31, 2, 0),
('The Triumphant Wilson', 'Mwahahaha!', 57, 71, 49, 2, 0),
('The Triumphant Winona', 'Sometimes i don\'t know who do i have to hit for things to work.', 78, 31, 55, 2, 0),
('The Triumphant WX-78', '*ERROR* OBLITERATION MODE ACTIVATED', 90, 12, 37, 2, 0),
('The Verdant Webber', '"Another prey steps into my web, i hope its not a pig, or a man, or both!"', 71, 15, 58, 2, 0),
('The Verdant Wes', '"He may not talk much, but his paintings tells a thousand words at a time."', 24, 54, 29, 2, 0),
('The Verdant Wolfgang', '"No burden is too heavy, no monster is too strong, Wolfgang will take care of them all... if there is enough food that is."', 84, 24, 82, 2, 0),
('The Victorian Wilson', 'As a respectful scientist should do!', 31, 90, 23, 2, 0),
('The Victorian Woodie', 'That\'s a fancy looking tree eh? Lucy would love to carve a good piece out of it.', 67, 39, 41, 2, 0),
('The Victorian Wormwood', 'May your path on the forest be overflown with the sweet scent of flowers!', 18, 43, 83, 2, 0);
